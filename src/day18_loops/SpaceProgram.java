package day18_loops;

import java.util.Scanner;

public class SpaceProgram {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please , enter a sentence: ");
        String userInput = key.nextLine();

        String userInputWithSpace = "";

        for (int i = 0; i < userInput.length() ; i++) {
            System.out.println(userInput.charAt(i));
            System.out.print(" ");


        }


    }
}
