package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner input = new Scanner(System.in);

        System.out.println("Please fill out the folling Madlib");
        System.out.println("I am 'Person 1' and I am a 'Word 1'. I am 'Age 1' years old. My goal is to become 'Word 2'. I look up to 'phrase 1'.");

        System.out.println("Please enter Person 1");
        String person1 = input.nextLine();
        System.out.println("Please enter Word 1");
        String word1 = input.nextLine();
        System.out.println("Please enter Age 1");
        String age1 = input.nextLine();
        System.out.println("Please enter Word 2");
        String word2 = input.nextLine();
        System.out.println("Please enter Phrase 1");
        String phrase1 = input.nextLine();

        System.out.println("Thank you for completing the Madlib");
        System.out.println("I am " + person1 + " and I am a " + word1 + ".");
        System.out.println("I am " + age1 + " years old.");
        System.out.println("My goal is to become " + word2 + ".");
        System.out.println("I look up to " + phrase1 + ".");
        
        

        
    }
}