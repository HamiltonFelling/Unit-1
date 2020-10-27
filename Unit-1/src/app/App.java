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

        String betnum[] = {"bet1", "bet2", "bet3", "bet4", "bet5", "bet6", "bet7", "bet8", "bet9", "bet10"};

        System.out.println("Welcome to Roulette");
        System.out.println("ROUND " + round);

        for (int i = 0; i < betnum.length; i++){
            System.out.println("Would you like to make an inside or outside bet?");
            String b = input.nextLine();
            int rand = (int)(Math.random()* range) + max;

            if (b.equals(inside)) {
                System.out.println("What number would you like to bet on");
                int num = input.nextInt();

                System.out.println("How much would you like to bet");
                int betamo = input.nextInt();
            if (betamo <= balance){
                System.out.println("Would you like to make another bet?");
                String amobet = input.nextLine();

            if (amobet.equals("no")){

                if (betamo == rand){
                    balance = balance * 35;
                    betamo = balance - betamo;
                }
                else{
                    balance = balance - betamo;
                }
            }
        }
            else {
                System.out.println("Insufficient balance please try again.");
            }










         
             } else if (b.equals(outside)) {
             } 
             
             
             
             
             
             
             else {
                    System.out.println("invalid statement, Please try again.");
            }



        
        }
    }
}
