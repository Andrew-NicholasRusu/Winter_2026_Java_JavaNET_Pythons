package org.example.Dynamic_Array_Package;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Basic Add & Get ===");
        DynamicArray<String> list = new DynamicArray<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        System.out.println(list.get(1)); // Bob
        System.out.println(list); // [Alice, Bob, Charlie]
        System.out.println("\n=== Add at Index ===");
        list.add(1, "Zara");
        System.out.println(list.get(1)); // Zara
        System.out.println(list); // [Alice, Zara, Bob, Charlie]

        System.out.println("\n=== Remove by Index ===");
        list.remove(0);
        System.out.println(list.get(0)); // Zara
        System.out.println(list); // [Zara, Bob, Charlie]

        System.out.println("\n=== Remove by Object ===");
        list.remove("Charlie");
        System.out.println(list.contains("Charlie")); // false
        System.out.println(list); // [Zara, Bob]
        System.out.println("\n=== Set ===");
        list.set(0, "Mia");
        System.out.println(list); // [Mia, Bob]

        System.out.println("\n=== indexOf / lastIndexOf ===");
        list.add("Bob");
        System.out.println(list.indexOf("Bob")); // 1
        System.out.println(list.lastIndexOf("Bob")); // 2

        System.out.println("\n=== Resizing (20 elements into capacity 3) ===");
        DynamicArray<Integer> nums = new DynamicArray<>(3);
        for (int i = 0; i < 20; i++)
            nums.add(i);
        System.out.println("Size: " + nums.size()); // 20
        System.out.println(nums);

        System.out.println("\n=== toArray ===");
        Object[] arr = list.toArray();
        for (Object o : arr)
            System.out.print(o + " ");

        System.out.println("\n\n=== Iterator (for-each) ===");
        for (String s : list)
            System.out.println(s);

        System.out.println("\n=== Clear & isEmpty ===");
        list.clear();
        System.out.println("Empty: " + list.isEmpty()); // true

        System.out.println("\n=== Exception Handling ===");
        try {
            list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            new DynamicArray<>(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
