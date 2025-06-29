package Methods;

import java.util.Scanner;

public class Age {

        public static void main(String[] args) {
            Scanner key = new Scanner(System.in);
            System.out.println("Please enter your deta of birth year: ");
            int birthYear = key.nextInt();
            calculateAge(birthYear);


        }
        public static void calculateAge (int birthYear) {
            System.out.println("Your age: " + (2025 - birthYear) );
        }
    }

