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
        
        int size = 6;
        int[] array = {4, 5, 6, 7, 4, 8, 7, 4, 8, 4, 9};
        
        // Show Example Input.
        System.out.println("Enter the size of the array: " + size);
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Confirm size
        System.out.print("Confirm the size of the array: ");
        int userSize = scanner.nextInt();
        
        // Encontrar o primeiro elemento repetido
        int firstRepeated = -1; // Flag para indicar ausência de repetição
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    firstRepeated = array[i];
                    break;
                }
            }
            if (firstRepeated != -1) {
                break;
            }
        }

        // Exibir o resultado
        if (firstRepeated != -1) {
            System.out.println("The first repeated element is: " + firstRepeated);
        } else {
            System.out.println("No repeated elements found.");
        }

        scanner.close();
    }
}