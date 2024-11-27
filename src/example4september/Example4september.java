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
     * @param c
     * @return 
     */
    public static int letterToNumber(char c) {
         c = Character.toLowerCase(c);
        return c - 'a';
    }
    
    
    public static boolean isDivisible(int num){
               return num % 3 == 0;
    }
       
    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }
    
    public static boolean isDivisible(char letter) {
        return letterToNumber(letter) % 3 == 0; 
    }
    
    public static boolean isDivisible(char letter, int base) {
       return letterToNumber(letter) % base == 0;
    }
            
    public static boolean isDivisible(char letter, char base){
        return letterToNumber(letter) % letterToNumber(base) == 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         //Create an object scanner 
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a number and a base
        System.out.printf("Please enter a number and a base separated by a space: ");
        int num = input.nextInt();
        int base = input.nextInt();
        
        //Display the result
        if (isDivisible(num)) 
            System.out.println(num + " is divisible by 3" );
         else 
            System.out.println(num + " is not divisible by 3" );
        
        if (isDivisible(num, base) && 3!=base){
        System.out.println(num+ " is  divisible by " + base); 
        }
        
        if (isDivisible(num, base) == false && 3!=base)
        System.out.println(num + " is  not divisible by " + base);
        
        
         input.nextLine();
        
        input.nextLine();
        
        //Prompt the user to enter an english letter, an number base and an English letter base 
        System.out.printf("Please enter an English letter: ");
        char c = input.next().charAt(0);
        System.out.printf("Please enter an number base and an English letter base, separated by a space: ");
        int num2 = input.nextInt();
        char letter = input.next().charAt(0); input.nextLine();
        input.nextLine();
        
        //Display the result
        if (isDivisible(c, num2))
            System.out.println("'" + c + "'" + " is divisible by "+ num2 );
        else
            System.out.println("'" + c + "'" + " is not divisible by " + num2);
        
        if (isDivisible(c, letter))
            System.out.println("'" + c + "'" + " is divisible by " + "'" + letter + "'");
        else
            System.out.println("'" + c + "'" + " is divisible by " + "'" + letter + "'");
        
    }
}

   

   


       
    
    


