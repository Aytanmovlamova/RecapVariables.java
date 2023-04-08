package day08_tasks;

import java.util.Scanner;
//Task #3 - LeapYear
//
//    Create a class called LeapYear in your Practice_Programming project and inside the day08_tasks package
//
//        Task:
//                create a main method
//		create a Scanner object
//
//		Ask the user to enter a year. Determine if the year is a leap year or not.
//		You can assume a leap year is a year that is divisible by 4. Print true or false.
//
//		Hint: use remainder operator
//
//
//		Ex:
//    			Enter a year
//    			2000
//
//    			The 2000 year is a Leap Year: true
//
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println(year + " is a leap year " + (year % 4 != 0));

    }
}
