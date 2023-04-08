package day09_tasks;

import java.util.Scanner;

public class PrintGreatest {
    //Task #6 - PrintGreatest
    //
    //    Create a class called PrintGreatest in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task:
    //
    //		Write Java program that will have three numbers and print the greatest number.
    //    		First number: 4
    //    		Second number: 8
    //    		Third number: 1
    //
    //			Output:
    //        			The greatest number from 4, 8, 1 is:  8
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first=4;
        int second=8;
        int third=1;
        if (first>second&&first>third){
            System.out.println("The greatest number from " +first);}
        if (second>first&&second>third){
            System.out.println("The greatest number from " +second);}
        if (third > first && third > second) {
            System.out.println("The greatest number from " +third);}
    }
}
