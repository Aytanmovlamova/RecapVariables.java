package day08_tasks;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product price and quantity");
        double price = input.nextDouble();
        int quantity = input.nextInt ();
        double revenue = price*quantity;
        System.out.println("revenue" +revenue);

    }


}
