package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND 1");
        int a = 10;
        String inside = "inside";
        String outside = "outside";
        int c = 5;
        int j = 0;

        while (a < 10 && a > 0) {

            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");
                int g = input.nextInt();
                System.out.println("How much would you like to bet");
                int h = input.nextInt();
                
                if (h <= c){
                    System.out.println("Would you like to make another bet? yes or no");
                    String i = input.nextLine();
                    if (i.equals("yes")) {
                        a = a - 1;
                        j = j + 1;

                    } else if (i.equals("no")) {

                    } else {
                        System.out.println("invalid statement, Please try again.");
                    }
                } else {
                        System.out.println("invalid statement, Please try again.");
              }
         
             } else if (b.equals(outside)) {
             } else {
                    System.out.println("invalid statement, Please try again.");
            }
            if (j == 1){
                int aa = g;
                int bb = h;
            }
            if (j == 2){
                int cc = g;
                int dd = h;
            }


        
        }
    }
}
