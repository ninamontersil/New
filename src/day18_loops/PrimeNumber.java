package day18_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please , enter a number and i will tell you if it is Prime Number or not: ");

        int userNum = key.nextByte();

        int counter = 0;
        if (userNum ==0) {
            System.out.println("We cannot check ");
        }

        for (int i = 1; i <= userNum; i++) {

            if (userNum % i == 0) {
                counter++;


            }
        }


    }
}
