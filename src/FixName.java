import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your name; ");
        String firstName = key.next();

        System.out.print("Please, enter your lastname:  ");
        String lastName = key.next();

        System.out.println("---------------------");
        System.out.println("Your full  name (before fix) :  " + firstName + " " + lastName);


    }
}
