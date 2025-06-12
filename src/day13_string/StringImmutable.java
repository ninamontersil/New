package day13_string;

public class StringImmutable {
    public static void main(String[] args) {
        String word1 = "Loop";
        String word2 = "Loop";

        System.out.println(word1);
        System.out.println(word2);

        word1 = word1 + "camp";

        System.out.println("______________________");

        System.out.println(word1);
        System.out.println(word2);

        String word3 = "LOOP";
        System.out.println(word3);

        word3 = "apple";
        System.out.println(word3);

        String word4 = new String("Wed");
        word4 = "Wednesday";
        word4 = new String("Wednesday");
        System.out.println(word4);
        word4 = new String("Wednesday!");

        System.out.println(word4);









    }
}
