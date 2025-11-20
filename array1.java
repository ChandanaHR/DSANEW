// An array is a linear data structure that stores multiple values of the same data type in 
// contiguous (continuous) memory locations.
// Elements are stored next to each other in memory.
// You access elements using an index (0, 1, 2, …).
// Arrays give fast access but slow insertion/deletion.

// Why contiguous memory
// Contiguous means back-to-back memory bytes are allocated.
//     Because memory is continuous:
//     If the base address = 1000
//     And each int = 4 bytes
//     → index 3 = 1000 + (3 × 4) = 1012
// This lets the CPU calculate any index directly → O(1) constant time access.
import java.io.*;
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        // Create an integer array of size 10 and store values 1–10.
        int[] arr1 = new int[in];
        for(int i=0;i<in;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<in;i++) {
            System.out.print(arr1[i]+" ");
        }
        // Create a string array and store 5 names.
        String[] arr2 = new String[in];
        for(int i=0;i<in;i++) {
            arr2[i] = sc.next();
        }
        System.out.println();
        for(int i=0;i<in;i++) {
            System.out.print(arr2[i]+" ");
        }
        // Create a float array and take values from user input.
        Float[] arr3 = new Float[in];
         for(int i=0;i<in;i++) {
            arr3[i] = sc.nextFloat();
        }
        System.out.println();
        for(int i=0;i<in;i++) {
            System.out.print(arr3[i]+" ");
        }
        Print the first and last element of an array.
        System.out.println(arr1[0] + " " +arr1[in-1]);
        // Print element at a given index (take index as input).
        int index = sc.nextInt();
        System.out.println(arr1[index]);
        // Check if an element exists in an array.
    }
}
