package day06_tasks;

public class CalculateAge {
    //Task:
    //create a main method
    //-Declare variables for the year of
    //birth and the current year
    //-Declare the third variable to
    //calculate the age
    //With a print statement to print out
    //"Your age: $age"
    //Note: all the variables have the
    //same data type, So, try to declare and assign
    //with declaring one data type
    public static void main(String[] args) {
        int yearOfBirth = 1994;
        int currentYear = 2023;
        int myAge = currentYear-yearOfBirth;
        System.out.println("My age: " + myAge);
    }

}
