package day09_tasks;

import java.util.Scanner;

public class OceanTank {
    //Task #5 - OceanTank
    //
    //    Create a class called OceanTank in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task:
    //
    //		You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
    //
    //        	> Above 90 - Your tank is full
    //        	> Above 80 - Still okay
    //        	> Above 70 - Don't go too far
    //        	> Above 60 - Start to head back
    //        	> Above 50 - Be careful now you are at 50%
    //
    //
    //
    //		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input
    //
    //		Example Output:
    //			What is your current oxygen level of in your tank?
    //			95
    //			You tank is full!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current oxygen level of in your tank?");
        int above = input.nextInt();
        if (above > 90) {
            System.out.println("your tank is full");
        }
        if (80 <= above && above <= 90) {
            System.out.println("Still okay");
        }
        if (70 <= above && above <80) {
            System.out.println("Don t go too far");
        }
        if (60 <= above && above < 70) {
            System.out.println("Start to head back");
        }
        if (50 <= above && above < 60) {
            System.out.println("Be careful now you are at 50%");
        }
        if (50>above){
            System.out.println("You will go heaven");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}






