package day15_string;

public class lastIndexOfMethods {
    public static void main(String[] args) {
        String str = "javacava";
        //01234567
        System.out.println( str.indexOf( 'a'));; //1
        System.out.println( str. lastIndexOf( 'a')); //1
        System.out.println(str.lastIndexOf("va"));
        System.out.println(str.lastIndexOf("av"));

        System.out.println("-----------------------");
        System.out.println(str.lastIndexOf('a', 20));
        System.out.println(str.lastIndexOf('a', str.length()-1 ));
    }
}
