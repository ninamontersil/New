package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String sentence = "Today is Wednesday. Wednesday is a fund day becase on Wednesday we have java classes.";
        System.out.println(sentence);

        sentence = sentence.substring(sentence.indexOf(".") + 2, sentence.lastIndexOf( " is")).toUpperCase();
        System.out.println(sentence);


    }
}
