package day15_string;

public class SubStringMethod {
    public static void main(String[] args) {
        String day = "Saturday";
        // 01234567
        System.out.println( day.substring(0));
        System.out.println( day.substring(1));
        System.out.println( day.substring(2));

        System.out.println("Sat" + day.substring(3));
        System.out.println("------------------------------");


        System.out.println( day.substring(0, 0));
        System.out.println( day.substring(0, 2));

    }
}
