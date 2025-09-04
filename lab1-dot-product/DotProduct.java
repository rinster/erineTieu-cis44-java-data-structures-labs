import java.util.ArrayList;
import java.util.Random;

public class DotProduct {

    public static ArrayList<Integer> generateRandomArray(int arrLen) {
        Random rand = new Random();

        ArrayList<Integer> arr = new ArrayList<>(arrLen);

        for (int i = 0; i < arrLen; i++) {
            arr.add(rand.nextInt(10));
        }

        return arr;

    }

    public static ArrayList<Integer> getDotProductArr(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newArr = new ArrayList<Integer>(a.size());

        for (int i = 0; i < a.size(); i++) {

            newArr.add(a.get(i) * b.get(i));

        }
        return newArr;
    }

    public static void main(String[] args) {
        // Create two arrays, have a helper function create the random arrays, with
        // length n
        // Generate array 1 and print
        ArrayList<Integer> arr1 = generateRandomArray(5);
        System.out.println("Array 1: " + arr1);

        // Generate array 2 and print
        ArrayList<Integer> arr2 = generateRandomArray(5);
        System.out.println("Array 2: " + arr2);

        // Create helper function to multiply the two arrays and print
        ArrayList<Integer> dotProdArr = getDotProductArr(arr1, arr2);
        System.out.println("Dot Product Array: " + dotProdArr);

    }

}
