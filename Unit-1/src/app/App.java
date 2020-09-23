package app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a color");
        String color = input.next();

        System.out.println("Please enter number of times you want the color repeated");
        int number = input.nextInt();

        while (count < number) {
            System.out.println(color);
            count = count + 1;
        }
            
    
        
    }
}