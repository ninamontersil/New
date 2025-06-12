package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a name with title:  ");
        String userNameWithTitle = key.nextLine();

        if (userNameWithTitle.startsWith("Mr") || userNameWithTitle.startsWith("Mister")) {
            System.out.println("Hello Sir.");
        } else if(userNameWithTitle.startsWith("Ms")){
            System.out.println("Hello Ma'am");
        }




            {

            }


        }

    }