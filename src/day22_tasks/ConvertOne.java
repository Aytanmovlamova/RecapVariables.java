package day22_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertOne {
    // Create a class called Initials in your Practice_Programming project and inside the day22_tasks package
    //
    //        Task:
    //		Ask the user to enter their first name
    //		Convert the name into a char array
    //		Print the first and last letter of the name

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first name :");
//        String name = input.next();
//        char[] a = name.toCharArray();
//        System.out.println(Arrays.toString(a));
//        System.out.println(""+a[0]+a[a.length-1]);



        Scanner put = new Scanner(System.in);

        System.out.println("Enter surname");
        String ad = put.next();
        char[] b = ad.toCharArray();
       System.out.println(Arrays.toString(b));
        System.out.println(""+b[1]+b[b.length-1]);










    }

}
