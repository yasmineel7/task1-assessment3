/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example4september;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author yasmi
 */
public class Example4september {

/**
     * @param num1
     * @param num2
     * @return 
     */
    public static double calcResult(double num1, double num2){
    return num1 + num2;
        
    }
    
    public static double calcResult(double num1, double num2, char oper) {
        switch (oper){
            case '+' -> {
                return num1 + num2;}

            case '-' -> {
                return num1 - num2;}

            case '*' -> {
                return num1 * num2;}
            
            case '/' -> {
                return num1 / num2;}

             default -> {System.out.println("Error");
            return 0;}
        }
        
      }

    public static double calcResult(String formula){
    String[] parts = formula.split(" ");
    Double num1 = Double.valueOf(parts[0]);
    Double num2 = Double.valueOf(parts[2]);
    char oper = parts[1].charAt(0);
        
    return calcResult(num1, num2, oper);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
         //Create a new scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter the numbers, operator and formula
        System.out.printf("Please enter two numbers, separated by space: ");
        double num1 = input.nextDouble(); 
        double num2 = input.nextDouble();
        System.out.printf("Please enter the operator (+, -, *, or /): ");
        char oper = input.next().charAt(0);
        System.out.printf("Please enter a formula, e.g.: \"3.14 * 2\":  "); input.nextLine();
        String  formula = input.nextLine(); 
        input.nextLine();
  
        //Display the result
        System.out.printf("%-25s : %.2f + %.2f = %.2f%n", "Calling the first method", num1, num2, calcResult(num1,num2));
        System.out.printf("%-25s : %.2f %c %.2f = %.2f%n", "Calling the second method", num1, oper, num2, calcResult(num1,num2,oper));
        System.out.printf("%-25s : %s = %.2f%n", "Calling the third method", formula, calcResult(formula));

        
    }
}

   

   


       
    
    


