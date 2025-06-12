package day15_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a message: ");
        String userMessage = key.nextLine();


        System.out.println("_________________________");
        System.out.println("Original message: " + userMessage);

        userMessage = userMessage.trim();
        System.out.println("Trimmed message:  : " + userMessage);

        System.out.println("---------------------------------");
        boolean hasBadwords = userMessage.contains("java is bad");







    }
}
