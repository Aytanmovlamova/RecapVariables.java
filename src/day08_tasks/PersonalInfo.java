package day08_tasks;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();
        System.out.println("Enter you favorite number");
        long number = input.nextLong();
        System.out.println("you are a student" + (18 <= age && 25 >= age));


    }


}
