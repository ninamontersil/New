package day10_tasks;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Please, enter the first number:  ");
        int num1= input.nextInt();

        System.out.println("Please, enter a second number:  ");
        int num2 = input.nextInt();

        System.out.println("Your result is:  " + (num1 + num2));

        if (num1 == num2) {
        System.out.println("Both numbers are equal. ");

        } else if (num1 >= num2) {
            System.out.println("First number is greater.");
        }
        else {
            System.out.println("Second number is greater");
        }





    }
}
