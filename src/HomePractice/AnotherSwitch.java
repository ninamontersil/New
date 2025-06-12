package HomePractice;

import java.util.Scanner;

public class AnotherSwitch {
    public static void main(String [] args) {
       // Description: Input two numbers and print which one is larger—or “Equal” if they’re the same.
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = num.nextInt();
        System.out.print("Enter second integer: ");
        int b = num.nextInt();
        if (a > b) {
            System.out.println("Maximum is: " + a);
        }  else if (a < b) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Both are equal");
        }





    }
}
