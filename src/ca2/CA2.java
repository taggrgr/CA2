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
        System.out.println("2. Generate a Multiplication Table");
        System.out.print("Enter your choice(1 or 2): ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                task1.handleFirstTask(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");       
      
            
        }
        
        scanner.close();
    }
}