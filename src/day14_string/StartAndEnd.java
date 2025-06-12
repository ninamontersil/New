package day14_string;

public class StartAndEnd {
    public static void main (String[] args) {
        String str1 = "Loopcamp";
        String str2 = "LOOp";

        // "".startsWith(""); will check if start or not - returns boolean
        System.out.println(str1. startsWith ("LOOp"));
        System.out.println(str1.startsWith("loop"));

        System.out.println(str1.startsWith("Loopcamp"));
        System.out.println(str1.startsWith("Loopcamp "));
        System.out.println(str1.startsWith("   Loopcamlp"));


        System.out.println();
        String sentence = "Today is Java class day";
        System.out.println(sentence.startsWith("Today"));

        System.out.println(sentence.endsWith("day"));

        System.out.println();
        boolean hasSameEnding = "loopCAMP".endsWith("camp");
        System.out.println(hasSameEnding);






    };

}
