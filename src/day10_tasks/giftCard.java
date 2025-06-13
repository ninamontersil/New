package day10_tasks;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double balance = 100.0;
        System.out.print("Enter item name: ");
        String item = in.nextLine();

        double price = 0;

        switch (item) {
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 25;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USB cable":
                price = 10;
                break;
            default:
                System.out.println("Invalid item!");
                return;


        } if (price > balance) {
             System.out.println("Sorry, not enough funds on your account");

         } else {
             balance -= price;
             System.out.println("Thank you for shopping");
             System.out.println("Your current balance is:  " + balance);



                }





        }


    }
