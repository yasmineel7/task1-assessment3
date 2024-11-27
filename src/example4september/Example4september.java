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
     * @param word
     * @return 
     */
    public static String convertCase(String word){
        String word2 = word.toLowerCase();
        char firstChar = word2.charAt(0);
        char firstChar1 = Character.toTitleCase(firstChar);
        String word3 = firstChar1 + word2.substring(1, word2.length());
        return word3;
    }
    
    public static String convertCase(String word, char caseType){
        
        switch (caseType){
             case 'l' -> {
                 String word1 = word.toLowerCase();
                 return word1;
            }
            case 'L' -> {
                String word1 = word.toLowerCase();
                 return word1;
            }
            case 'u' -> {
               String word1 = word.toUpperCase();
                 return word1;
            }
            case 'U' -> {
                String word1 = word.toUpperCase();
                 return word1;
            }
            case 't' -> {
                String word2 = word.toLowerCase();
        char firstChar = word2.charAt(0);
        char firstChar1 = Character.toTitleCase(firstChar);
        String word3 = firstChar1 + word2.substring(1, word2.length());
        return word3;
            }
            case 'T' -> {
                String word2 = word.toLowerCase();
        char firstChar = word2.charAt(0);
        char firstChar1 = Character.toTitleCase(firstChar);
        String word3 = firstChar1 + word2.substring(1, word2.length());
        return word3;
            }
            
            default -> System.out.println("Error");
           
    }
        return null;
           
    }
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        //Create an object scanner
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a word
        System.out.printf("Please enter a word: ");
        String word = input.nextLine();
        
        //Prompt the user to choose a case
        System.out.println("Please choose the case you want to convert: "); 
        System.out.println("1. 'l' or 'L'for lowercase");
        System.out.println("2.'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase"); 
        char caseType = input.next().charAt(0); 
       
        //Display the result
        input.nextLine(); input.nextLine();
        System.out.printf("%-38s : %s","Original word ", word); 
        input.nextLine();
        System.out.printf("%-38s : %s","Calling the first convertCase method", convertCase(word));
        input.nextLine();
        System.out.printf("%-38s : %s","Calling the second convertCase method", convertCase(word,caseType)); 
        input.nextLine();
        
    }
}

   

   


       
    
    


