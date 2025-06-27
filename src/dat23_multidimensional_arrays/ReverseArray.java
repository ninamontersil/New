package dat23_multidimensional_arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /* write a program that will reverse the order of any given array
        ex; [1,2,34,5]
        output; [5,4,3,2,1]

         */

        int [] nums= {1,2,3,4,5};
        int[] reversed = new int[nums.length]; // {1,2,3,4,5};

        for (int i = nums.length-1; i>= 0; i--) {
            reversed [nums.length - i] = nums[i];









        }

    }
}
