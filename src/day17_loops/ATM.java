package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int validPinCode = 9876;
        int userEnterPinCode;
        int attemptCount=3;

        System.out.println("Welcome to ATM");


        do {
            System.out.println("Please, enter pin code: ");
            userEnterPinCode = key.nextInt();

//            if (userEnterPinCode != validPinCode && attemptCount >0);
//            System.out.println("Try again");
            attemptCount--;
        } while ( userEnterPinCode != validPinCode && attemptCount > 0 );

        if (attemptCount == 0) {
            System.out.println("You are locked out!");

        }else {
            System.out.println("You have been successfully logged in");


        }




        }
    }
