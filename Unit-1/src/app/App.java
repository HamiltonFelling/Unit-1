package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to dog facts, please choos a fact (1-5)");

        int pp = 1;

        while (pp < 2) {
            int fact = input.nextInt();

            if (fact == 1) {
                System.out.println("Dogs noses are wet to help absorb scent chemicals");
                System.out.println("Enter number (1-5) for next fact");
            }
            if (fact == 2) {
                System.out.println("The Beatles song ‘A Day in the Life’ has a frequency only dogs can hear");
                System.out.println("Enter number (1-5) for next fact");
            }
            if (fact == 3) {
                System.out.println("Three dogs survived the Titanic sinking");
                System.out.println("Enter number (1-5) for next fact");
            }
            if (fact == 4) {
                System.out.println("The tallest dog in the world is 44 inches tall");
                System.out.println("Enter number (1-5) for next fact");
            }
            if (fact == 5) {
                System.out.println("The Saluki is the oldest dog breed");
                System.out.println("Enter number (1-5) for next fact");
            }
            if (fact > 5) {
                System.out.println("An error has occured, please re-enter a number");
            }
            if (fact <= 0) {
                System.out.println("An error has occured, please re-enter a number");
            }
        }
    }
}
