package day22_arrays;

import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println("Size of word: " + word.length());

        System.out.println("Word:  " + word);


        System.out.println("___________________");
        char[] letter = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        System.out.println("Size of char arr:  " + letter.length);
        System.out.println(letter);
        System.out.println(Arrays.toString(letter));

        System.out.println("________________");
        char [] wordInArr = new char[word.length()];

        wordInArr[0]  = word.charAt(0);

    }
}
