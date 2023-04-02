package day05_tasks;

public class EmployeeInfo {

    //Task:
    //create a main method
    //declare and assign these variables:
    //first name - > James
    //last name - > Bond
    //gender - > M
    //age - > 40
    //company name - > MI6
    //are the full time - > true
    //job title - > Special Agent
    //salary - > 1000000
    //number of pto (0-25) - > 15
    //are they married - > false
    //suite(char - A, B, C, D) - > D
    //-Print all the variables seperately
    //-Also make an output like the following but use one String
    //variable assign the value to String variable and with one print
    //statement print it out:
    //Employment information for James Bond
    //Gender: M
    //Special Agent at MI6
    //Currently 40 years old
    //MI6 is located in suite D
    //This years salary comes to $1000000
    //Other details:
    //PTO: 40
    //Full time? true
    //Married? false
    //Hint: Use escape sequences
    //----------------------------------
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        char gender = 'M';
        int age = 40;
        String companyName = "MI6";
        boolean areTheFullTime = true;
        String jobTitle = "Special Agent";
        long salary = 1000000L;
        int numberOfPto = 15;
        boolean areTheyMarried = false;
        char suite = 'D';

        System.out.println();

        System.out.println("Employment information for " +firstName+ " " +lastName+"\ngender: " + gender +"\nSpacial agent at " + companyName + "\nCurrently " + age + " years old" + "\n" + companyName + " is located in suite " + suite + "\nThis years salary comes to $" + salary + "\nOther details:"+"\nPTO:" + age + "\nFull time? "+ areTheFullTime + "\nMarried? " + areTheyMarried);

















    }


}
