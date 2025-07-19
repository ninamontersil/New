package day32_customclasses;
/*

Create a coffee class with these instance variables:
     price, size(oz), brand, types

     ex types: black, cappuccino, latte, mocchiato....

instance methods:

    - make a toString to print all the information of the coffee objects

    - drink(): print: drinking $type type of coffee

    - refill(amount in oz): print refilling x oz
        add the number of oz to the total size

 */

public class Coffee {
    @Override
    public String toString() {
        return "Coffee{" +
                "price=" + price +
                ", sizeInOz=" + sizeInOz +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    //instance variables

        double price;
        int sizeInOz;
        String brand;
        String type;

}
