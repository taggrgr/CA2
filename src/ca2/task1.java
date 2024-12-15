/* Link to GitHub repo https://github.com/taggrgr/CA2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class task1 {

    public static void handleFirstTask(Scanner scanner) {
        
        // Fixed size as required on assessment task
        int size = 6;

        // Predefined array elements
        int[] preDefinedArray = {4, 5, 6, 7, 4, 8, 7, 4, 8, 4, 9};
        int[] array = new int[size];

        // Copy the first 'size' elements into the array
        for (int i = 0; i < size; i++) {
            array[i] = preDefinedArray[i];
        }

        // Find the first repeated element
        int firstRepeated = findFirstRepeated(array, size);

        // Display the results
        System.out.println("Task 1: Array Search. Find the First Repeated Element");
        System.out.println("Enter the size of the array: " + size); // Always 6
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        if (firstRepeated != -1) {
            System.out.println("The first repeated element is: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }
    }

    // Logic to find the first repeated element using nested loops
    private static int findFirstRepeated(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    return array[i]; // Return the first repeated element
                }
            }
        }
        return -1; // No repeated elements
    }
}