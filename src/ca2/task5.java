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
public class task5 {
    public static void handleFifthTask(Scanner scanner) {
        // Fixed input for array size and elements
        int size = 6;
        int[] array = {5, 3, 8, 6, 2, 7};

        // Display the array before sorting
        System.out.print("Array before sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform Bubble Sort
        int swapCount = bubbleSort(array);

        // Display the array after sorting
        System.out.print("Array after sorting: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Display the total number of swaps
        System.out.println("Total number of swaps: " + swapCount);
    }

    private static int bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0;

        // Perform Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Increment swap counter
                    swapCount++;
                }
            }
        }

        return swapCount;
    }
}
