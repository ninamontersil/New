package day18_loops;
/*
     Palindrome: its the same reading from the beginning and end

     Ex:
         mom
         racecar
         Anna
         madam

     Task: Check if a word is palindrome
 */
public class Pallindrome {
    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        for (int i = word.length() -1; i >=0; i--) {
            //reversed = reversed + word.charAt(i);
            reversed += word.charAt(i);

            System.out.println("original word:  " + word);
            System.out.println("Reversed word: " + reversed);


        }

    }
}

