package day15_string;

public class Empty {
    public static void main(String[] args) {
        String str = "new method";

        System.out.println(( str.isEmpty()));
        System.out.println(str.length() != 0);

        str = "";
        System.out.println( str.isEmpty());
        System.out.println(str.length());



    }
}
