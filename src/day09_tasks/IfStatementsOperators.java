package day09_tasks;

import java.util.Scanner;

public class IfStatementsOperators {
    //Task #3 - IfStatementsOperators
    //
    //    Create a class called KgToPounds in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task:
    //   		Write a program that will accept a boolean value. Print out the opposite of the given boolean
    //
    //		Ex:
    //			true -> false
    //            		false -> true
    //
    //
    //		Note: Use Scanner class and the ! (NOT) operator
    //
    //		Example Output:
    //			Write a boolean value (true or false):
    //			true
    //			The opposite of you what you put is: false
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a boolean value  : ");
        boolean value = input.nextBoolean();
        if (value ) {
            System.out.println("The opposite of you what you put is " + false);
        } else {
                System.out.println("The opposite of you what you put is " +true);
            }
        }


    }
