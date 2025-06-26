package day22_arrays;

import java.util.Arrays;

public class SortExample {

    public static void main(String[] args) {

        int [] nums = {23, 54, -2, 45,234, 65, - 234};
        System.out.println("Before sorted : " + Arrays.toString(nums));

        int [] sortedNums = nums; // did not create a new array. i pointed to the same one.
        System.out.println("Before sorted:  " +Arrays.toString(sortedNums));

        System.out.println("--------------------------------------------");
        Arrays.sort(nums);
        System.out.println("After sorted:  " + Arrays.toString(nums));
        System.out.println("After sorted: " + Arrays.toString(sortedNums));



    }
}
