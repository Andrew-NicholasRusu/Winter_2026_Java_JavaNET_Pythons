package org.example.MyLinkedList_Package;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== addFirst / addLast ===");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("B");
        list.addFirst("A");
        list.addLast("C");
        System.out.println(list); // [A, B, C]

        System.out.println("\n=== add at index ===");
        list.add(1, "X");
        System.out.println(list); // [A, X, B, C]
        System.out.println("\n=== get / set ===");
        System.out.println(list.get(2)); // B
        list.set(2, "Z");
        System.out.println(list); // [A, X, Z, C]

        System.out.println("\n=== removeFirst / removeLast ===");
        list.removeFirst();
        list.removeLast();
        System.out.println(list); // [X, Z]

        System.out.println("\n=== remove by index / object ===");
        list.add("W");
        list.remove(0);
        System.out.println(list); // [Z, W]
        list.remove("W");
        System.out.println(list); // [Z]

        System.out.println("\n=== indexOf / lastIndexOf / contains ===");
        list.add("Z");
        list.add("Y");
        System.out.println(list.indexOf("Z")); // 0
        System.out.println(list.lastIndexOf("Z")); // 1
        System.out.println(list.contains("Y")); // true


        System.out.println("\n=== getFirst / getLast ===");
        System.out.println(list.getFirst()); // Z
        System.out.println(list.getLast()); // Y
        System.out.println("\n=== toArray ===");
        Object[] arr = list.toArray();
        for (Object o : arr)
            System.out.print(o + " ");
        System.out.println();
        System.out.println("\n=== Stack behavior (Bonus) ===");
        MyLinkedList<Integer> stack = new MyLinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack); // [3, 2, 1]
        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 2
        System.out.println("\n=== Queue behavior (Bonus) ===");
        MyLinkedList<Integer> queue = new MyLinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue); // [10, 20, 30]
        System.out.println(queue.poll()); // 10
        System.out.println(queue); // [20, 30]


        System.out.println("\n=== for-each Iterator (Bonus) ===");
        for (String s : list)
            System.out.print(s + " ");
        System.out.println();

        System.out.println("\n=== Descending Iterator (Bonus) ===");
        Iterator<String> desc = list.descendingIterator();
        while (desc.hasNext())
            System.out.print(desc.next() + " ");
        System.out.println();

        System.out.println("\n=== clear / isEmpty ===");
        list.clear();
        System.out.println("Empty: " + list.isEmpty()); // true
        System.out.println(list); // []

        System.out.println("\n=== Exception Handling ===");
        try {
            list.getFirst();
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        try {
            list.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

    }
}
