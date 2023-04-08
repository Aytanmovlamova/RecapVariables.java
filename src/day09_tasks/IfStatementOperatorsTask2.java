package day09_tasks;

import java.util.Scanner;

public class IfStatementOperatorsTask2 {
    //Task 2 - IfStatementOperatorsTask2
    //
    //    Create a class called IfStatementOperatorsTask2 in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task:
    //        	Write a program that will accept your salary amount.
    //    		Then also ask the user if they are full time or not (boolean).
    //   		If they are fulltime add 20000 to their salary,
    //   		but if they are part time then subtract 5000.
    //    		Print the final salary.
    //
    //		Note: Use Scanner class (also use arithmetic operators and reassign the new values based on the true or false info)
    //
    //		Example Output:
    //			What is you salary: $
    //			100000
    //			You are a full time employee ? (true or false):
    //			true
    //			This is you final salary: $120000
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is you salary: $");
        double salary = input.nextDouble();

        System.out.println("Are you a full time employee (True or False)");
        boolean fullTime = input.nextBoolean();

        if (fullTime) {
            salary += 200000;
        } else {
            salary -= 5000;
        }
        System.out.println("This is your final salary: $ "+salary);


    }
}
