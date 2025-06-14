package day18_loops;
/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
Input: 2juMp41EEkd4s4

Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */

public class CountChars {

    public static void main(String[] args) {
        String str = "Nina13MonTersil12";

        int upperCaseCount =0;
        int lowerCaseCount =0;
        int numbersCount = 0;


        //UpperCase
        //LowerCase
        //Numbers

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (65 <= eachChar && eachChar <= 90) {
                upperCaseCount++;
            }


        }


    }
}
