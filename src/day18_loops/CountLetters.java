package day18_loops;

public class CountLetters {
    /*
    given a string we want to count how many 'a' chars we have
    ex: "aabavs
    3

     */

    public static void main(String[] args) {
        String str = "aabbcaa";
        char letter ='a';
        int counter =0;

        /*
        get each charachter from str
        compare if it is same as letter
         */

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                counter++;


            }


        }

        System.out.println("You have " + counter + " letter" );

    }
}
