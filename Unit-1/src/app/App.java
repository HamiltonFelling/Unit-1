package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String inside = "inside";
        String outside = "outside";

        int max = 36;
        int min = 0;
        int range = max - min + 1;
        int balance = 5;
        int round = 1;
        int results = 1;
        int bet = 9;
        int done = 0;

        int betamo[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String color[] = {"green","red","black","red","black","red,","black","red","black","red","black","black","red","black","red","black","red","black","red","red","black","red","black","red","black","red"}

        boolean betSuccess = false;
        boolean anobet = false;

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND " + round);

        int rand = (int) (Math.random() * range) + max;

        for (int i = 0; i < betamo.length; i++) {
            
            anobet = false;
            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");

                int num = input.nextInt();
                input.nextLine();
                while (betSuccess == false) {
                    System.out.println("How much would you like to bet");
                    betamo[i] = input.nextInt();
                    input.nextLine();
                    if (betamo[i] <= balance) {
                        betSuccess = true;
                    } else if (betamo[i] >= balance) {
                        System.out.println("Insufficient Balance try again, your balance is $" + balance + ".");
                    } else {
                        System.out.println("Invalid statement try again");
                    }
                }



            }

            else if (b.equals(outside)) {
                System.out.println("What number would you like to bet on?");

            }

            else {
                System.out.println("invalid statement, Please try again.");
            }


                while (anobet == false) {
                    System.out.println("Would you like to make another bet? You have " + bet + " bets remaining.");
                    String amobet = input.nextLine();

                    if (amobet.equals("yes")) {
                        anobet = true;
                        betSuccess = false;
                        bet --;
                    }

                    else if (amobet.equals("no")) {
                        anobet = true;
                        done = 1;

                    } else {
                        System.out.println("Invalid statement try again");
                    }
                }
        }

    }
}
