package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND 1");
        int a = 0;
        String inside = "inside";
        String outside = "outside";
        int c = 1;

        

        while (a < 10) {
            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();
            if (b.equals(inside)) {
                while (b =)
                System.out.println("Please enter the number you want to bet on '1 - 36'");
                String d = input.nextLine();
                
            } else if (b.equals(outside)) {
            } else {
                System.out.println("invalid statement, Please try again.");
            }
            }

        }

    }

}
