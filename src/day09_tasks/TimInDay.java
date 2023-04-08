package day09_tasks;

import java.util.Scanner;

public class TimInDay {
    //Task #6 - TimInDay
    //
    //    Create a class called TimInDay in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task:
    //
    //		Write a Java program to implement following logic using if statement
    //        		1. if hour is less than 12 noon, greet with Good Morning
    //        		2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
    //        		3. if hour is greater than or equal to 3 pm, greet with Good Evening
    //        		4. if not in between time zone print invalid  // I added this. Was not in the question.
    //
    //
    //		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input
    //
    //		Example Output:
    //			What time is it now (put between 0 and 24 only)?
    //			-1
    //			Invalid input!

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("What time is it now?");
        int hours = input.nextInt();
        if (0<=hours&&hours<12){
            System.out.println("Good morning ");
        }
        if (12<= hours&&hours<15){
            System.out.println("Good afternoon");
        }
        if (15<=hours&&hours<24){
            System.out.println("Good evening");
        }


    }


}

