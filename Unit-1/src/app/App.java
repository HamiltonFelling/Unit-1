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
        int round  = 1;
        int results = 1;
        int bet = 9;

        int betamo[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND " + round);

        int rand = (int)(Math.random()* range) + max;
    while (bet <= 9)
        for (int i = 0; i < betamo.length; i++){
            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");
                
                int num = input.nextInt();
                    while (1 < 2){
                        System.out.println("How much would you like to bet");
                     betamo[i] = input.nextInt();
                    if (betamo[i] <= balance){
                        break;}
                    else if (betamo[i] >= balance) {
                        System.out.println("Insufficient Balance try again, your balance is $" + balance + ".");
            }
                    else {
                        System.out.println("Invalid statement try again");
            }
        }
            while (1 < 2){
                System.out.println("Would you like to make another bet? You have " + bet + " bets remaining." );
                String amobet = input.nextLine();
            
            if(amobet.equals("yes")){
                break;
            }

            else if (amobet.equals("no")){
            System.out.println("RESULTS");
            System.out.println("You have rolled a " + rand + ".");
                }
            else {
                System.out.println("Invalid statement try again");
            }
        }
            bet = bet - 1;

            }


            
        

             else if (b.equals(outside)) {
             } 
             
             
             
             
             
             
             else {
                    System.out.println("invalid statement, Please try again.");
            }
        }

    }
}

