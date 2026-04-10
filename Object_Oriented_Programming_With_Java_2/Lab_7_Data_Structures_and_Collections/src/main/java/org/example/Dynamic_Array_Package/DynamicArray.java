package org.example.Dynamic_Array_Package;

import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * Part 1 - Core Structure
     * Create a generic class DynamicArray<T> with:
         *  A private Object[] internal array
         *  A private int size to track the number of elements
         *  A default initial capacity of 10
         *  Two constructors:
             * o DynamicArray() - default capacity
             * o DynamicArray(int initialCapacity) - custom capacity
 * @param <T>
 */
public class DynamicArray<T> implements Iterable<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] internalArray;
    private int size;

    public DynamicArray() {
        this.internalArray = new Object[this.DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Part 4 - Bounds Checking
     *  Throw IndexOutOfBoundsException with a meaningful message for invalid indices in get(),
     * set(), remove(int), and add(int, T)
     *  Throw IllegalArgumentException in the constructor if initialCapacity < 0
     */

    public DynamicArray(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity: " + initialCapacity + " is less than 0");
        }
        this.internalArray = new Object[initialCapacity];
        this.size = 0;
    }

    /**
     * Part 2 - Required Methods
     * Implement all the following methods:
     */
    // void add (T element) that appends the element to the end.
    public void add(T element) {
        // What if the size > internalArray capacity, we will have outOfBound exception
        // Recall dynamic array should grow automatically to avoid that.
        if (this.size == this.internalArray.length) { // checks if the array is full
            this.growInternalArray(100);
        }
        this.internalArray[this.size] = element;
        size++;
    }

    ///  Helper Methods ///
    private void growInternalArray(int extraSpace) {
        // grow THIS array: this.internalArray
        // first, create a new array of double the size.
        int newSize = this.internalArray.length + extraSpace;
        if (newSize <= 0) newSize = DEFAULT_CAPACITY; // fallback if something goes wrong.
        Object[] newArray = new Object[newSize];
        // copy the old array to the new array
        int copyLimit = Math.min(this.size, newSize);
        for (int i = 0; i < copyLimit; i++) {
            newArray[i] = this.internalArray[i];
        }
        this.internalArray = newArray;  // it will go to garbage collection.
    }

    /**
     * Method used for T accessors
     *
     * @param index
     */
    private void checkIndexIsInRange(int index) {
        if (index < 0 || index > (this.size - 1))
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bound, size: " + this.size);
    }

    // void add (int index, T element) that inserts the element at the given index.
    public void add(int index, T element) {
        // What if the index is less than 0 or bigger than size?
        // Then, we should throw an exception
        if (index < 0 || index > this.size)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bound, size: " + this.size);

        // I need to make sure we have enough capacity
        // What if the size > internalArray capacity, we will have outOfBound exception
        // Recall dynamic array should grow automatically to avoid that.
        if (this.size + 1 > this.internalArray.length) {
            this.growInternalArray(100);
        }
        // Make space for the new element, meaning we have to push to the right all elements
        // starting from index all the way till the end
        for (int i = this.size; i > index; i--) {
            this.internalArray[i] = this.internalArray[i - 1]; // move one step forward
        }
        // Now the position index is empty, we can overwrite it.
        this.internalArray[index] = element;
        this.size = this.size + 1; // update the current size
    }

    // T get (int index) that returns the element at the index.
    public T get(int index) {
        // what if the index is < 0 ir >= size, then we should throw an exception
        this.checkIndexIsInRange(index);
        // the index is acceptable
        @SuppressWarnings("Unchecked")
        T result = (T) this.internalArray[index];
        return result;
    }

    // T set (int index, T element) that replaces the element, and returns the old value.
    public T set(int index, T element) {
        // Throw an exception if index is out of bound
        this.checkIndexIsInRange(index);
        @SuppressWarnings("Unchecked")
        T oldValue = (T) this.internalArray[index];
        // Add the element:
        this.internalArray[index] = element;
        return oldValue;
    }

    // T remove (int index) that removes and returns the element at index
    public T remove(int index) {
        // Throw an exception if index is out of bound
        this.checkIndexIsInRange(index);
        // I need to save the element at index
        @SuppressWarnings("Unchecked")
        T removedElement = (T) this.internalArray[index];

        // Move backward all elements after the index until the end
        for (int i = index; i < this.size - 1; i++) {
            this.internalArray[i] = this.internalArray[i + 1];
        }
        // Reduce the size by 1
        internalArray[size - 1] = null;
        size--;
        return removedElement;
    }

    /**
     * Bad remove (Object) method
     */
    // boolean remove(Object o) that removes the first occurrence of the object
    public boolean remove(Object o) {
        // Search for the object o inside my internalArray
        int foundLocation = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.internalArray[i] == o) {
                foundLocation = i;
                break;
            }
        }
        boolean result;
        if (foundLocation == -1) // it means I did not find the object
            result = false;
        else { // I have found the object at foundLocation
            // Now I know the index of the object that needs to be removed: foundLocation
            // Why not use my .remove method to remove it?
            this.remove(foundLocation);
            result = true;
        }
        return result;
    }

    public boolean contains(Object o) {
        // Search for the object o inside my internalArray
        int index = this.indexOf(o);
        return index != -1;
    }

    /**
     * Better remove (Object) method
     */

    public boolean removeBetter(Object o) {
        int index = this.indexOf(o);
        if (index != -1)
            this.remove(index);
        return index != -1;
    }

    // int size() that returns the number of elements
    public int size() {
        return this.size;
    }

    public int indexOf(Object o) {
        // search for the object o inside my internalArray
        for (int i = 0; i < this.size; i++) {
            if (this.internalArray[i] == null) {
                if (o == null) return i;
            } else if (internalArray[i]. equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        // search for the object o inside my internalArray
        for (int i = this.size - 1; i >= 0; i--) {
            if (o == null) {
                if (this.internalArray[i] == null) return i;
            } else if (o.equals(this.internalArray[i])) {
                return i;
            }
        }
        return -1;
    }

    // void clear(): Removes all elements
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.internalArray[i] = null;
        }
        this.size = 0;
    }

    // Object[] toArray(): Returns a copy of the internal array
    public Object[] toArray() {
        Object[] newArray = new Object[this.size]; // create a new array with size
        // copy all elements in internalArray to newArray
        for (int i = 0; i < this.size; i++) {
            // create a new object
            Object newObject = this.internalArray[i];
            newArray[i] = this.internalArray[i];
        }
        return newArray;
    }

    //
    public boolean isEmpty() {
        return size == 0;
    }

    // void ensureCapacity(int minCapacity): Grows array if needed
    public void ensureCapacity(int minCapacity) {
        // if the user calls this method, it means that he want to make sure, that means the length
        // of the internal Array is bigger a certain minCapacity that he wants.
        // make sure that minCapacity >> this.internalArray.length
        if (this.internalArray.length < minCapacity) {
            // we have to grow by minCapacity - internalArray.length
            int theIncrease = minCapacity - internalArray.length;
            this.growInternalArray(theIncrease + 1);
        }
    }

    // void trimToSize(); Shrinks internal array to current size
    public void trimToSize() {
        // compute the amount that I need to reduce the internal Array
        if (this.size < this.internalArray.length) {
            Object[] newArray = new Object[this.size];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.internalArray[i];
            }
            this.internalArray = newArray;
        }
    }

    //toString method
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(internalArray[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Part 5 - Iterator Support (Bonus)
     *  Implement the Iterable<T> interface so your class works in a for-each loop
     *  Implement a private inner class DynamicArrayIterator that implements Iterator<T>
     *  Support hasNext(), next(), and optionally remove()
     */

    @Override
    public Iterator<T> iterator() {
        // Create an iterator object by calling a constructor and return it
        return new DynamicArrayIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }


    // inner class
    public class DynamicArrayIterator implements Iterator<T> {
        private int index = 0; // Starts at 0, not -1

        public DynamicArrayIterator() {
            // No initialization needed - index is already 0
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            // to avoid crash, I should throw an exception if the user tries to get the next element while there is none.
            if (!hasNext()) {
                throw new NoSuchElementException("There is no next element");
            }
            // get the next element
            // recall that index is our current location in the internal array
            @SuppressWarnings("unchecked")
            T nextValue = (T) internalArray[index];
            // make sure to increment the index
            index++;
            return nextValue;
        }
    }
}  // this is the end of the class.
