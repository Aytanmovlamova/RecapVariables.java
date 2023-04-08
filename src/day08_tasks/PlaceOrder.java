package day08_tasks;

import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name");
        String PN = input.nextLine();
        System.out.println("Enter the price");
        double price = input.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println("Enter the full name");
        String fullName = input.nextLine();

        double total = price*quantity;
        System.out.println(fullName+ " your order for "+quantity +" " + PN +  " has been plased. Your total is $" +total);




    }



}

