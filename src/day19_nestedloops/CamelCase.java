package day19_nestedloops;
/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter multiple words in a sentence: ");
        String sentence =input.nextLine().trim().toLowerCase();


        /* find the space and take the next char and make it bigger
        all the rest has to be lowercase
         */
        String camelCaseVersion = "";
        for(int i =0; i < sentence.length(); i++) {
           if (sentence.charAt(i) == ' ') {
               ("" + sentence.charAt(i + 1)).toUpperCase();
           } else {
               camelCaseVersion += sentence.charAt(i+1);
               System.out.println(camelCaseVersion);

           }
        }




    }
}
