package app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of times you want the color purple repeated");
        int number = input.nextInt();

        while (count < number) {
            System.out.println("purple");
            count = count + 1;
        }
            
    
        
    }
}