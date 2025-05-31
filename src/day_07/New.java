package day_07;

public class New {
    public static void main(String[] args) {

        int age = 70;

        // Check if the person is a kid
        if (age <= 13) {
            System.out.println("The person is a kid.");
        }
        // Check if the person is a senior citizen
        else if (age >= 65) {
            System.out.println("The person is a senior citizen.");
        }
        // Otherwise
        else {
            System.out.println("The person is neither a kid nor a senior citizen.");
        }
    }
}