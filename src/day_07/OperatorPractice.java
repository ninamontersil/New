package day_07;

public class OperatorPractice {
    public static void main(String[] args) {
        int b = 12;

        b++; // post increment: b = b + 1; b =13;
        System.out.println(b);

        ++b; // pre increment: b = b +1; b - 14;
        System.out.println(b);

        b--; // post decrement; b = b - 1; b = 13
        System.out.println(b);

        --b; // pre decrement; b =b - 1; b =12
        System.out.println(b);

        System.out.println("-----------------------------");

        System.out.println(b++);  // post increment (update) = print (use)
        // print (use) - . 12
        //update -. b = 13


    }
}
