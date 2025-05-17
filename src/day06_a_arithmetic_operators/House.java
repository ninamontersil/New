package day06_a_arithmetic_operators;


public class House {
    public static void main(String[] args) {
        //Single house, Town house, Apartment, Penthouse, Multifamily
       String houseType = "Penthouse";

       int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        int allRooms =  numberOfBedrooms + numberOfBathrooms + numberOfKitchens;
        int zipcode = 220033;

        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isForSale = true;
        boolean isParkNearBy = false;

        double costOfTheHouse = 675000.99;
        double schoolRatings = 4.5;

        String address = "455 NE, 24 th St" ;
        System.out.println("The " + houseType + " is located at " + address + " " +zipcode + ".");
        System.out.println("Has basement" + " " + "and");








    }
}
