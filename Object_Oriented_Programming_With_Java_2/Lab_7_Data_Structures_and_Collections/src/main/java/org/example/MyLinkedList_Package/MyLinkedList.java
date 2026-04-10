/**
 * 2. [20 points] MyLinkedList Package
 * Implement a doubly linked list class MyLinkedList<T> in Java that mimics the behavior of Java's LinkedList,
 * using nodes as the underlying structure. You will practice pointer/reference manipulation, generics, and
 * iterator design.
 */

package org.example.MyLinkedList_Package;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A custom doubly linked list implementation mimicking java.util.LinkedList.
 * Supports standard list operations, stack behaviors, and queue behaviors natively.
 *
 * @param <T> The type of elements held in this collection
 */
public class MyLinkedList<T> implements Iterable<T> {

    /**
     * Nested private Node class (Requirement Part 1).
     * Represents a single element in the doubly linked list.
     */
    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        // Constructor to initialize a Node with given data
        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node<T> head; // Pointer to the first element in the list
    private Node<T> tail; // Pointer to the last element in the list
    private int size;     // Current number of elements in the list

    /**
     * Default constructor creates an empty list.
     */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * // ===========================
     * Part 5: Bounds Checking
     * // ===========================
     */

    /**
     * Helper to validate bounds for getting/removing elements.
     */
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Helper to validate bounds for inserting elements.
     * Notice index can be equal to size when adding to the very end.
     */
    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * // ===========================
     * Part 4: Private Helper
     * // ===========================
     */

    /**
     * Efficient helper method that traverses from head or tail depending on index location.
     */
    private Node<T> nodeAt(int index) {
        checkIndex(index);

        // If the index is in the first half of the list, traverse forwards from head
        if (index < size / 2) {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
        // If the index is in the second half, traverse backwards from tail
        else {
            Node<T> current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    /**
     * Prepends the specified element to the beginning of the list.
     */
    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);

        // If list is empty, both head and tail point to this single node
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // Otherwise, link the current head and the new node together
            newNode.next = head;
            head.prev = newNode;
            head = newNode; // Move the head pointer
        }
        size++;
    }

    /**
     * Appends the specified element to the end of the list.
     */
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        // If list is empty, both head and tail point to this single node
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // Otherwise, append to the tail and adjust pointers
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; // Move the tail pointer
        }
        size++;
    }

    /**
     * Adds an element to the end of the list.
     */
    public void add(T element) {
        addLast(element);
    }

    /**
     * Inserts the specified element at the specified position.
     */
    public void add(int index, T element) {
        checkPositionIndex(index);

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            // Inserting in the middle: fetch node currently at this index
            Node<T> current = nodeAt(index);
            Node<T> prevNode = current.prev;
            Node<T> newNode = new Node<>(element);

            // Re-wire pointers to wedge the newNode between prevNode and current
            prevNode.next = newNode;
            newNode.prev = prevNode;

            newNode.next = current;
            current.prev = newNode;
            size++;
        }
    }

    /**
     * @return the first element in the list
     */
    public T getFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        return head.data;
    }

    /**
     * @return the last element in the list
     */
    public T getLast() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");
        return tail.data;
    }

    /**
     * @return the element at the specified position
     */
    public T get(int index) {
        return nodeAt(index).data;
    }

    /**
     * Replaces the element at the specified position with the given element.
     *
     * @return the old value
     */
    public T set(int index, T element) {
        Node<T> target = nodeAt(index);
        T oldVal = target.data;
        target.data = element;
        return oldVal;
    }

    /**
     * Removes and returns the first element from this list.
     */
    public T removeFirst() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");

        T data = head.data;
        if (size == 1) {
            // If it was the last item, list becomes totally empty
            head = tail = null;
        } else {
            // Move head reference and disconnect the removed node entirely
            Node<T> newHead = head.next;
            newHead.prev = null;
            head.next = null; // breaks reference
            head = newHead;
        }
        size--;
        return data;
    }

    /**
     * Removes and returns the last element from this list.
     */
    public T removeLast() {
        if (isEmpty()) throw new NoSuchElementException("List is empty");

        T data = tail.data;
        if (size == 1) {
            // If it was the only item, list becomes totally empty
            head = tail = null;
        } else {
            // Step the tail backwards and sever its connection to the old end
            Node<T> newTail = tail.prev;
            newTail.next = null;
            tail.prev = null; // breaks reference
            tail = newTail;
        }
        size--;
        return data;
    }

    /**
     * Removes and returns the element at the specified position.
     */
    public T remove(int index) {
        checkIndex(index);
        if (index == 0) return removeFirst();
        if (index == size - 1) return removeLast();

        // Extracting from the middle requires reconnecting adjacent nodes directly
        Node<T> target = nodeAt(index);
        Node<T> prevNode = target.prev;
        Node<T> nextNode = target.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        target.prev = null;
        target.next = null;

        size--;
        return target.data;
    }

    /**
     * Removes the first occurrence of the specified element.
     */
    public boolean remove(Object o) {
        Node<T> current = head;

        if (o == null) {
            while (current != null) {
                if (current.data == null) {
                    removeNode(current);
                    return true;
                }
                current = current.next;
            }
        } else {
            while (current != null) {
                if (o.equals(current.data)) {
                    removeNode(current);
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    // Helper method to remove a specific node:
    private void removeNode(Node<T> node) {
        Node<T> prevNode = node.prev;
        Node<T> nextNode = node.next;

        if (prevNode == null) {
            head = nextNode;
        } else {
            prevNode.next = nextNode;
        }

        if (nextNode == null) {
            tail = prevNode;
        } else {
            nextNode.prev = prevNode;
        }

        node.prev = null;
        node.next = null;
        node.data = null;

        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    /**
     * Traverses the list sequentially from head to tail to locate the node.
     */
    public int indexOf(Object o) {
        int index = 0;
        Node<T> current = head;

        if (o == null) {
            while (current != null) {
                if (current.data == null) return index;
                current = current.next;
                index++;
            }
        } else {
            while (current != null) {
                if (o.equals(current.data)) return index;
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    /**
     * Traverses the list backwards from tail to head to locate the node.
     */
    public int lastIndexOf(Object o) {
        int index = size - 1;
        Node<T> current = tail;

        if (o == null) {
            while (current != null) {
                if (current.data == null) return index;
                current = current.prev;
                index--;
            }
        } else {
            while (current != null) {
                if (o.equals(current.data)) return index;
                current = current.prev;
                index--;
            }
        }
        return -1;
    }

    /**
     * Disassociates all elements, making the list empty.
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Converts the list elements into a native Array.
     */
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size && current != null; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    // --- Stack Methods (FILO behavior) ---

    public void push(T element) {
        addFirst(element); // Stacks add to the "top" (head)
    }

    public T pop() {
        return removeFirst();
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack is empty");
        return getFirst();
    }

    // --- Queue Methods (FIFO behavior) ---

    public void offer(T element) {
        addLast(element); // Queues join at the "back" (tail)
    }

    public T poll() {
        if (isEmpty()) return null; // Safe remove, returns null if empty
        return removeFirst();       // Queues process from the "front" (head)
    }

    /**
     * Provides a nice string representation e.g. [A, B, C]
     */
    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // --- Iterators ---

    /**
     * Part 6: Iterator Support
     * @return
     */

    @Override
    // Implement Iterable<T> so the class works in a for-each loop
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    public Iterator<T> descendingIterator() {
        return new DescendingIterator();
    }

    /**
     * Standard forward iterator (head to tail).
     */
    // Implement a private inner class MyIterator that implements Iterator<T>
    private class MyIterator implements Iterator<T> {
        private Node<T> current = head;
        private Node<T> lastReturned = null;

        // Support hasNext(), next(), and remove()
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            lastReturned = current;
            T outData = current.data; // Stores the value of the current element in the linked list.
            current = current.next;
            return outData;
        }

        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException("next() must be called before remove()");
            }

            // Re-wire node connections to skip over `lastReturned`
            Node<T> prevNode = lastReturned.prev;
            Node<T> nextNode = lastReturned.next;

            if (prevNode == null) {
                head = nextNode;
            } else {
                prevNode.next = nextNode;
            }

            if (nextNode == null) {
                tail = prevNode;
            } else {
                nextNode.prev = prevNode;
            }

            size--;
            lastReturned = null; // Prevent sequential removes
        }
    }

    /**
     * Backward iterator (tail to head).
     */

    // Bonus Challenge
    private class DescendingIterator implements Iterator<T> {
        private Node<T> current = tail; // Starts at the tail
        private Node<T> lastReturned = null; // Ends at head

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            lastReturned = current;
            T outData = current.data;
            current = current.prev; // Travel backwards instead
            return outData;
        }

        @Override
        public void remove() {
            if (lastReturned == null) {
                throw new IllegalStateException("next() must be called before remove()");
            }

            Node<T> origPrev = lastReturned.prev;
            Node<T> origNext = lastReturned.next;

            if (origPrev == null) {
                head = origNext;
            } else {
                origPrev.next = origNext;
            }

            if (origNext == null) {
                tail = origPrev;
            } else {
                origNext.prev = origPrev;
            }

            size--;
            lastReturned = null;
        }
    }
}
