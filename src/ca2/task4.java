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
public class task4 {
    public static void handleFourthTask(Scanner scanner) {
        // Fixed input for rows and columns
        int rows = 3, cols = 3;
        System.out.println("Enter rows: " + rows + "; and columns: " + cols + "; of matrix");
        

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Fixed input for matrix elements
        System.out.println("Enter elements of the matrix:");
        int[][] fixedInput = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Simulate user input via Scanner
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = fixedInput[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Perform spiral traversal
        System.out.println("Output:");
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols);
    }

    private static void spiralTraversal(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left (if top <= bottom)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top (if left <= right)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println(); // Move to the next line after traversal
    }
}
