package day08_tasks;

import java.util.Scanner;
import java.util.SortedMap;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a salary");
        double salary = input.nextDouble();
        double hour = salary/(40*52);
        System.out.println("Hourly rate of the employee: $ " +hour);

    }





}
