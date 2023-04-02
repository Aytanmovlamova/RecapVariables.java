package day08_tasks;

import java.util.Scanner;

public class Divisible {
    //Task #1 - Divisible
    //
    //    Create a class called Divisible in your Practice_Programming project and inside the day08_tasks package
    //
    //        Task:
    //            	create a main method
    //		create a main method
    //		create a Scanner object
    //		Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values
    //
    //
    //		Ex:
    //    			Enter a number
    //    			65
    //
    //    			65 is divisible by 2: false
    //    			65 is divisible by 3: false
    //    			65 is divisible by 5: true
    //
    //            			Hint: Use escape sequences
    //
    //

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter a number " + number);
        System.out.println(number + "division by 2" +( number  %2==0));
        System.out.println(number + "division by 3" +( number  %3==0));
        System.out.println(number + "division by 5" +( number  %5==0));
    }



}
