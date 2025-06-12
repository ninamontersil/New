package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence");
        String sentence = key.nextLine();
        System.out.println("First Char: " + sentence.charAt(0));
        System.out.println("Last Char: " + sentence.charAt( sentence.length() - 1 ));

        if (sentence.charAt(0) == sentence.charAt( sentence.length() - 1 )) {
            System.out.println("Same");
        } else {
            System.out.println("Different");

        }
    }
}
