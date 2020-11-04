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
        int color[] = {0,1,2,12,1,2,1,2,1,2,2,1,2,1,2,1,2,1,1,2,1,2,1,2,1,2,1,2,2,1,2,1,2,1,2,1};
        //0=green 1=red 2=black
        int betnum[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int colorbet[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        
        

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND " + round);

        int rand = (int) (Math.random() * range) + max;

        for (int i = 0; i < betamo.length; i++) {
            boolean betSuccess = false;
            boolean anobet = false;
            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");

                betnum[i] = input.nextInt();
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
                System.out.println("What color would you like to bet on?");
                colorbet[i] = input.nextInt();
                input.nextLine();
                if (colorbet[i] <= balance) {
                        betSuccess = true;
                    } else if (betamo[i] >= balance) {
                        System.out.println("Insufficient Balance try again, your balance is $" + balance + ".");
                    } else {
                        System.out.println("Invalid statement try again");
                    }

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
                if (done == 1){
                System.out.println("You have rolled a " + rand + ".");
                    for (i = 0; i < betamo.length; i++){
                        if (betnum[i] > 0){
                            System.out.println("Bet ");
                            
                        }
                    }
                }
                }
        }

    }
}
