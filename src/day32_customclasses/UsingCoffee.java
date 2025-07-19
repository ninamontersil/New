package day32_customclasses;

public class UsingCoffee {
    public static void main(String[] args) {


        //since there is no custom constructor declared, this is using defauts
        Coffee coffee1 = new Coffee();

        // if there is no toString method declared, this will print memory location.
        //toString method is a special method that can be implemented to give object info

        System.out.println(coffee1);


    }

}
