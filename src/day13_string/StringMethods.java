package day13_string;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Tom";// by litterals = in string pool inside heap
        String name2 = "Tom"; // by litterals - in string pool inside heap
        String name3 = new String("Tom"); //by new keyword - directly in heap

// == this wil lcompare memory location ( do not use this to compare values)

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);

        //1 - .equals(); this will compare the String Value (including the case sensitiveness)
        System.out.println(name1.equals(name2)  );
        System.out.println( name1.equals(name3) );

        //how can we compare sensitiveness
        //2. - .equalIgnoreCase(); this will compare the string value (excluding the case sensitiveness)

        String str1 = "Wed";
        String str2 = "Wed";
        System.out.println(str1.equalsIgnoreCase(str2));

        //how can i get how many characters we have in the string
        //3 - .length(); this will give us the number of total characters
        String sentence = "I love java";
        System.out.println(sentence.length());


        int numOfCharactersInSentence = sentence.length();
        System.out.println(numOfCharactersInSentence);




    }

}
