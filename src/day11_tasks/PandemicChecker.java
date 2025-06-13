package day11_tasks;

import java.util.Scanner;

public class PandemicChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); {
            System.out.print("Please, enter a year:  ");
            int year = in.nextInt();

            if ( year >= 1346 && year <= 1353) {
                System.out.println("The Black Death");
            } else if  ( year >= 1665 && year <= 1666) {
                System.out.println("Great Plague of London");
            } else if (year >= 2020) {
                System.out.println("Covid 19 Pandemic");

            }  else {
                System.out.println("No Pandemic");

            }


        }
    }
}
