package day13_string;

import java.util.Scanner;

public class Day03_String {
    public static void main(String[] args) {
        /*
    Given a day number, find and print the day related to the number

    1- Monday
    2- Tuesday

    6- Saturday
    7- Sunday

    any other number: Not a day
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number that represents day of week(between 1 - 7): ");
        int userInput = scan.nextInt();
        String dayFromNum = "9";


        switch (userInput){
            case 1:
//                System.out.println("Monday");
                dayFromNum = "Monday";
                break;
            case 2:
                dayFromNum = "Tuesday";
//                System.out.println("Tuesday");
                break;
            case 3:
//                System.out.println("Wednedsay");
                dayFromNum = "Wednesday";
                break;
            case 4:
//                System.out.println("Thursday");
                dayFromNum = "Thursday";
                break;
            case 5:
//                System.out.println("Friday");
                dayFromNum = "Friday";
                break;
            case 6:
//                System.out.println("Saturday");
                dayFromNum = "Saturday";
                break;
            case 7:
//                System.out.println("Sunday");
                dayFromNum = "Sunday";
                break;
            default:
//                System.out.println("Not a day");
                dayFromNum = "Not a day";
                break;



        }
        System.out.println(dayFromNum);

    }
}
