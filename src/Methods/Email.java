package Methods;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String fullName = key.nextLine();

    }
    public static void buildEmail (String fullName) {

       String result = ("" + fullName.charAt(0) + fullName.substring(  fullName.indexOf(" ") + 1 ) + "@gmail.com");
       result = result.toLowerCase();
        System.out.println(result);





    }
}
