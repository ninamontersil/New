package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] str= {"java", "hello", "bye", "Hi"};

        System.out.println("Before sorted:  " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("After sorted:  "+Arrays.toString(str));


    }
}
