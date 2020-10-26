package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND 1");
        
        int a = 10;
        int c = 5;

        String inside = "inside";
        String outside = "outside";

        int max = 36;
        int min = 0;
        int range = max - min + 1;

        while (a <= 10 && a > 0) {

            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");
                int g = input.nextInt();
                System.out.println("How much would you like to bet");
                int h = input.nextInt();

                int rand = (int)(Math.random()* range) + max;
                
                if (h <= c){
                    System.out.println("Would you like to make another bet? yes or no");
                    String i = input.nextLine();
                    if (i.equals("yes")) {











                    } else if (i.equals("no")) {
                    } else {
                        System.out.println("invalid statement, Please try again.");
                    }













                } else {
                        System.out.println("You do not have enough balance, Immediate cash out.");
                        a = 100;
              }
         
             } else if (b.equals(outside)) {
             } else {
                    System.out.println("invalid statement, Please try again.");
            }



        
        }
    }
}
