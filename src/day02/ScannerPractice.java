package day02;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How is the weather?");
        String weather = input.next();
        if (weather.equalsIgnoreCase("Sunny")){
            System.out.println("The weather is sunny.");

        } else {
            System.out.println("It is not sunny.");


        }
    }
}
