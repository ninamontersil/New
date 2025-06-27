package dat23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    /*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int [] arr = {45, 123, 62};
        System.out.println("This is our original array: ' + Arrays.toString(arr)");

        System.out.println("How many elements do you want to add:  ");

        int newSize = key.nextInt();

        int [] biggerArr = Arrays.copyOf(arr, newSize);
        System.out.println("The new array is : " +Arrays.toString(biggerArr));

        System.out.println("Please give me elements, so i can add them into array. ");

        for (int i = 0; i <newSize - arr.length; i++) {
            System.out.println("Your num: ");
            key.nextInt();



        }





    }
}
