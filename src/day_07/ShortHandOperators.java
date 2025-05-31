package day_07;

public class ShortHandOperators {
    public static void main (String[] args) {
        int a = 10;  // declared and initialized (first value) variable called 'a'
        a = 20;  // reassigned variable 'a' into a new value
        a++; // reassigned by post increment (increasing value by 1)  a = a (20) + 1; a =21
        ++a; //reassigned by pre increment ( increasing value by 1 )  a = a (21) + 1 = 22;
        a = a + 1; // reassigned by increasing value by 1 ------- a = a (22) + 1; a = 23;
        a = a + 10;  // reassigned by increasing value by 10;
        System.out.println(a);

        a += 10; //reassigned by shorthand operatod adding 10, 33 to 43
        System.out.println(a);

    }
}
