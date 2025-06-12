package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);
        System.out.println("Please enter URL:  ");
        String url = scammer.next();

        if (!url.startsWith("www.") && url.endsWith(".com")) {
            System.out.println("Invalid URL");
        } else {
            System.out.println("Middle portion of URL: " + url.substring( url.indexOf(" .")+ 1, url.lastIndexOf(".")) );





        }
    }
}
