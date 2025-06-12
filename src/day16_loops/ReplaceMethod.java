package day16_loops;

public class ReplaceMethod {

    public static void main(String[] args) {

        String str = "java is a fun coding language";

        System.out.println("Before .replace(): " + str);
        str= str.replace( 'a',  'e');
        System.out.println("After .replace(): " + str);

        str = str.replace('k', 'a');
        System.out.println("After .replace(): " + str);

        str = str.replace('e', 'u');
        System.out.println("After .replace(): " + str);

        System.out.println("___________________________");

        String sentence = "Today is Wednesday. Wednesday is a fund day becase on Wednesday we have java classes. ";
        System.out.println("Before .replace(): " + sentence);
        sentence = sentence.replace("wednesday", "thursday");
        System.out.println("After .replace(): " + sentence);

        System.out.println("___________________________");








    }
}
