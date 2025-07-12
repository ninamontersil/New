package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in) ;
        System.out.println("Please, tell how many numbers do you want to coompate:  ");  //5

        int [] nums = new int [ key.nextInt() ]; //5

        for (int i = 0; i < nums.length; i++) { //5
            System.out.println("Please enter num : ");
            nums[i] = key.nextInt();

            System.out.println("Your array:  " + Arrays.toString(nums));


        }






    }
}
