package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int pp = 1;

        System.out.println("Please guess the number 1-100");
        while (pp < 2) {
        int rr = input.nextInt();

        if (rr == 54) {
            System.out.println("You have guessed the right number '54'.");
            pp = pp + 2;
        }
        else if (rr <= 53) {
            System.out.println("Low");
        }
        else if (rr >= 55) {
            System.out.println("High");
        }

        }

    }
}