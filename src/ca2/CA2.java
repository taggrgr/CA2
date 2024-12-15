/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;
import java.util.Scanner;
/**
 *
 * @author tiago
 */
public class CA2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a task");
        System.out.println("1. Find the First Repeated Element");
        System.out.println("2. Multiplication Table Using 2D Array");
        System.out.println("3. Diagonal Sum of a Matrix");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                task1.handleFirstTask(scanner); // Task 1 logic
                break;
            case 2:
                task2.handleSecondTask(scanner); // Task 2 logic
                break;
            case 3:
                task3.handleThirdTask(scanner); // Task 3 logic
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
        }
        
        scanner.close();
    }
}