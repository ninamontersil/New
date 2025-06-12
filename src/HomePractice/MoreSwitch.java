package HomePractice;

import java.util.Scanner;

public class MoreSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote. ");
        } else {
            System.out.println("Not eligible to vote.");


        }

    }
 }
