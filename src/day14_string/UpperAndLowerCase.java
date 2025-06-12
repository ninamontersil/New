package day14_string;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String day = "Thursday";
        System.out.println(day);

        //4 - "".toUpperCase(); --> converts the String to ALL UPPERCASE and returns String
        System.out.println(( day.toLowerCase()));
        System.out.println( day.toUpperCase());
        System.out.println( day );
        day = day.toUpperCase();
        System.out.println(day);



    }
}
