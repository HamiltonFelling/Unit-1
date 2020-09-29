package app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int a = 1;
        int correct = 0;
        int correct2 = 0;
        int correct3 = 0;
        int correct4 = 0;
        int correct5 = 0;

        System.out.println("What is 10+10");
        int user1 = input.nextInt();
        if (user1 == 20) {
            System.out.println("Answer Correct");
            correct = a;
        } else {
            System.out.println("Answer Incorrect");
        }
        System.out.println("What  is 5x5");
        int user2 = input.nextInt();
        if (user2 == 25) {
            System.out.println("Answer Correct");
            correct2 = a;
        } else {
            System.out.println("Answer Incorrect");
        }
        System.out.println("What  is 100/10");
        int user3 = input.nextInt();
        if (user3 == 10) {
            System.out.println("Answer Correct");
            correct3 = a;
        } else {
            System.out.println("Answer Incorrect");
        }
        System.out.println("What  is 30-5");
        int user4 = input.nextInt();
        if (user4 == 25) {
            System.out.println("Answer Correct");
            correct4 = a;
        } else {
            System.out.println("Answer Incorrect");
        }
        System.out.println("What  is 4x10");
        int user5 = input.nextInt();
        if (user5 == 40) {
            System.out.println("Answer Correct");
            correct5 = a;
        } else {
            System.out.println("Answer Incorrect");
        }
        int total = correct + correct2 + correct3 + correct4 + correct5;
        System.out.println("Your Total score is " + total + "/5");
    }

}
