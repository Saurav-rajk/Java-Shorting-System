//  Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 12, 1, 45, 21, 2, 3, 5, 6};
        String[] arr2 = {"asd", "gfgd", "bhf", "urt", "wrf", "opou"};
        Arrays.sort(arr1); // Sorting the numeric part
        System.out.println("Sort numeric array: " + Arrays.toString(arr1));
        Arrays.sort(arr2);  // Sorting the array part.
        System.out.println("Sort string array: " + Arrays.toString(arr2));
    }
}