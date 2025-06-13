package day10_tasks;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter your budget:  ");
        double budget = input.nextDouble();

        if (budget < 0) {
            System.out.println("That is not a valid budget");
        }


            if (budget > 300000) {
                System.out.println("Too much money for this agency");

            }

                if (budget >= 55000 && budget  <= 75000) {
                    System.out.print("Neighborhood: Oaks | Rating: 3.5, | Gated: yes | Pets allowed: no");


                } else {
                    System.out.println("No available houses");




                }


            }
        }









