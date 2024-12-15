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
public class task3 {
    public static void handleThirdTask(Scanner scanner) {
        // Fixed input for matrix size
        System.out.println("Enter size of matrix: 3");
        int size = 3;

        // Initialize the matrix
        int[][] matrix = new int[size][size];

        // Fixed input for matrix elements
        System.out.println("Elements row by row:");
        int[][] fixedInput = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Simulate user input via Scanner
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = fixedInput[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the sum of the main diagonal
        int mainDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            secondaryDiagonalSum += matrix[i][size - i - 1];
        }

        // Output results
        System.out.println("Task 3: Diagonal Sum of a Matrix");
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
    }
    
}
