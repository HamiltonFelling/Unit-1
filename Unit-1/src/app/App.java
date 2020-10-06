package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        for (int pp = -1; pp < 1000;) {
            pp = pp + 1;
            System.out.println(pp);
        }

        int password = 2132;
        int tt = 2;
        int qq = 0;
        int gg = 0;

        System.out.println("Please enter password, you have 3 Attempts");

        while (qq < 4) {
            int rr = input.nextInt();

            if (rr == password) {
                System.out.println("Correct password");
                System.out.println("Hello Mr. Osowski");
            } else if (gg < 2) {
                System.out.println("Please retry password " + tt + " attempt's' remaining.");
                qq = qq + 1;
                tt = tt - 1;
                gg = gg + 1;
            } else {
                qq = qq + 1;
            }
            if (qq == 3) {
                System.out.println("Error: too many attempts, please try again later.");
            }
        }

    }
}
