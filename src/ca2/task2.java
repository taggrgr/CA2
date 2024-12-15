/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2;
import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class task2 {
    public static void handleSecondTask(Scanner scanner) {
        // Input the fixed size of the multiplication table
        int tableSize = 5;
        System.out.println("Size of multiplication table: " + tableSize);

        // Generate the multiplication table
        int[][] multiplicationTable = new int[tableSize][tableSize];
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                multiplicationTable[i - 1][j - 1] = i * j;
            }
        }

        // Display the multiplication table
        System.out.println("Task 2: Multiplication Table Using 2D Array");
        System.out.println("Multiplication Table:");
        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
