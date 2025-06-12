package day16_loops;

import java.util.Scanner;

public class MoveFirst {
    /*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence:  ");
        String sentence = key.nextLine();

        String updateSentence = sentence.substring(sentence.indexOf("  ")).trim() + " " + sentence.substring(0, sentence.indexOf(" ") );

        System.out.println(updateSentence);

        //TODO: handle if user give you single word


    }
}
