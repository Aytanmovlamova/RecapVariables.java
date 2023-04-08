package day08_tasks;

import java.util.Scanner;
//Task #2 - EvenOrOdd
//
//    Create a class called EvenOrOdd in your Practice_Programming project and inside the day08_tasks package
//
//        Task:
//		create a main method
//		create a Scanner object
//		Ask the user to enter an int number, print if the number is even or odd as boolean values
//
//		Ex:
//    			Enter an int number
//    			65
//
//    			65 is even: false
//    			65 is odd: true
//

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Enter an int number");
        int number = input.nextInt();
        System.out.println(number + " is even" +(number%2==0));
        System.out.println(number + " is odd" +(number%2==1));
        System.out.println(number + " is odd" +(number%2!=0));

    }
}
