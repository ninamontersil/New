package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String validUsername = "Loopcamp";

        String validPassword = "LoopBatch#5";


        System.out.print("Please, enter your username;  ");
        String inputUsername = keyboard.next();

        keyboard.nextLine();// to handle the ENTER


        System.out.print("Please, enter your password: ");
        String inputPassword = keyboard.nextLine();

        if (validUsername.equalsIgnoreCase(inputUsername) && validPassword.equals(inputPassword)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect input");
            if(validPassword.equals(inputPassword)) {
                System.out.println("Password is not correct!");


                if (inputPassword.length() < 8) {
                    System.out.println("Your password input should not be less than 8 characters");

                }
            }



        }
        {
            {

            }}
        }
    }