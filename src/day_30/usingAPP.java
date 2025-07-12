package day_30;

public class usingAPP {

    // THIS IS  JUST A RUNNER - WILL HAVE MAIN METHOD TO START EXECUTION
    public static void main(String[] args) {
//        System.out.println(name); // not accessible - not valid
        // to be able to reach instance variables, we need to create object
        // object Reference = object itself

        App app1= new App();
        //app1 has its own copy of instance variables and methods

        //created another app object
        App app2  =new App ();


        System.out.println("_______________");


// this will show the defaults values as we have not given any;

        System.out.println(app2.name);
        System.out.println(app2.version);
        System.out.println(app2.isFree);
        System.out.println(app2.reviews);

        System.out.println("___________");

        app1.run();
        app2.run();

        System.out.println("______________");
        app1.name = "Instagram";
        app2.name= "YouTube";

        app1.run();//calling run method with reference - app1
        app2.run(); //calling run method with reference - app2

        System.out.println("________________-");



    }
}
