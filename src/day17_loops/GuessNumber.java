package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNum =435;
        int userGuess;

        do {
            System.out.println("Please guess what my secret number is: ");
            userGuess = key.nextInt();

            if (userGuess < secretNum);

        } while (userGuess != secretNum);

        }
    }





