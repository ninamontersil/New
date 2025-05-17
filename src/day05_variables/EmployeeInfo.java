package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String gender = "M";
        int age = 40;
        String companyName = "MI6";
        boolean areTheyFullTime = true;
        String jobTitle = "Special Agent";
        int salary = 1000000;
        int numberOfPto = 15;
        boolean areTheyMarried = false;
        char suite = 'D';



        System.out.println("Employment information for " + firstName +" "+ lastName);
        System.out.println("Gender " +gender);
        System.out.println(jobTitle +" at " + companyName);
        System.out.println("Currently " + age + " years old");
        System.out.println("M16 is located in suite " + suite);
        System.out.println("This year salary comes to $" + salary);
        System.out.println("Other details:");
        System.out.println("\t\t\t\tPTO: "+numberOfPto);
        System.out.println("\t\t\t\tFull time " +areTheyFullTime);
        System.out.println("\t\t\t\tMarried? " +areTheyMarried);





    }
}
