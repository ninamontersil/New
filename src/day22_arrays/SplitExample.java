package day22_arrays;

import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {
        String str = "monday tuesday thursday friday saturday sunday";
        System.out.println("String size: " + str.length());

        String [] days = str.split(" ");
        System.out.println((Arrays.toString(days)));
        System.out.println("Array size: " + days.length);

        System.out.println("___________________");
        String [] days2 = str.split("day");
        System.out.println(Arrays.toString(days2));




    }

}
