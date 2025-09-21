package lab3_dynamic_arrays;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>();

        arr.add("mom");
        arr.add("cat");
        arr.add("peach");
        arr.add("banana");
        arr.add("cherry");
        arr.add("monkey");
        arr.add("hana");
        arr.add("stone");
        arr.add("abc");
        arr.add("blue");

        System.out.println("Array 1 size: " + arr.arrLen()); // expect 10
        arr.printDynamicArr();

        arr.add("mango");
        System.out.println("Array 1 size: " + arr.arrLen()); // expect 20
        arr.printDynamicArr();

        System.out.println("Get element at index 4: " + arr.get(4));
        arr.printDynamicArr();

        String removed = arr.remove(4);
        System.out.println("Removed: " + removed); // Cherry
        arr.printDynamicArr();

        arr.get(25); // Out of bounds error

    }
}
