package day18_loops;

import java.util.Scanner;

/*
Count Words
Given a sentence determine how many words are in the String.
        Ex:
Input:
        "This has multiple words in this sentence"

Output:
        7
        */
public class CountWords {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please,enter a sentece:  ");
        String sentence = key.nextLine().trim();

        //find the space -count of space +1
        
        int countSpace = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                countSpace++;
            }
            
        }
        System.out.println("Count of spaces: " + countSpace);
        System.out.println("You have " + (countSpace+1) + " words.");



    }

}
