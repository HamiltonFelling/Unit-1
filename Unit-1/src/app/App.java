package app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number");
        int aa = input.nextInt();
        System.out.println("Please Enter in Another Number");
        int bb = input.nextInt();
        int pp = 0;
        int cc = bb;
        int dd = aa;

        if (bb < aa) {
            cc = aa;
            dd = bb;
        }

        if (dd % 2 == 0) {
            pp = 4;
        }
        if (dd % 2 == 1) {
            pp = 3;
        }

        if (pp == 4) {
            for (int i = dd; i < cc; i = i + 2) {
                System.out.println(i);
            }
        }
        if (pp == 3) {
            for (int i = dd + 1; i < cc; i = i + 2) {
                System.out.println(i);
            }
        }
    }
}
