package day22_arrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        /*

    Given a sentence
        today is monday

     reverse the sentence with words
        monday is today

 */
        String sentence = "today is monday";
        String reversedSentence = " ";

        String [] sentenceInArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceInArr));

        for (int i = sentenceInArr.length - 1;  i >= 0; i--) {
            reversedSentence += sentenceInArr[i] + " ";

            System.out.println("Original: " + sentence);
            System.out.println("Reversed: " + reversedSentence.trim());
            
        }



    }
}
