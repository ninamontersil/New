package day14_string;

public class RecapStringMethods {
    public static void main(String[] args) {
        //declared string reference
        String str1 = "loop"; //by literals
        String str2 = "loop";  // by literals
        String str3 = new String("loop"); // by "new" keyword
        String str4 = new String("loop"); // by "new" keyword

        //comparing with "=="
        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str3 == str4); // false


        // "".equals(""); --- > compares the value (exact characters)

        System.out.println(str1.equals(str2) ); //true
        System.out.println(str1.equals(str3) ); //true
        System.out.println(str3.equals(str4)); //true
        System.out.println("loop".equals(str3)); //true
        System.out.println(( "loop" .equals("loop"))); //true

        boolean resultOfEqualsMethod = str1.equals(str2);

        String str5 = "Loop";
        System.out.println(str1.equalsIgnoreCase((str4)));
        boolean isSameWithoutCaseSensitiveness = "LoOp".equalsIgnoreCase(str5);

        if (isSameWithoutCaseSensitiveness) {
            System.out.println("These two string values are same without case sensitiveness");
        } else {
            System.out.println("These two string value are not same without case sensitiveness");

            System.out.println();
            // "".length(); ---> counts how many characters there are and returns int
            System.out.println( str1.length() );
            str1 = str1 + "camp"; // we made a new string (string is immmutable)

            int num = 10;
            System.out.println(("" + 10).length() );








        }















    }
}
