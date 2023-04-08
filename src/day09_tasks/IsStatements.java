package day09_tasks;

import java.util.Scanner;

public class IsStatements {
    //Task #4 - IsStatements
    //
    //    Create a class called IsStatements in your Practice_Programming project and inside the day09_tasks package
    //
    //        Task a:
    //		//Write an if statement that assigns 5 to x when y is equal to 20
    //
    //
    //        Task b:
    //		//Write an if statement that sets the variable fees to 50 if the Boolean variable max is true
    //
    //	Task c:
    //		//Write an if statement that assigns 20 to the variable a if variable b is 50 and c is greater and equal to 100
    //
    //
    //	Task d:
    //		//Write an if statement that prints Ideal Temp if the temp is between 70 and 80
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int y = input.nextInt();
        int x;
        boolean max;
        if (y==20);{
            x=5;
            System.out.println(x);}

        int y1=input.nextInt();

        if ( y1==50){
            max=true;
            System.out.println(max);
        }else {
            max=false;
            System.out.println(max);
        }

        int a=input.nextInt();
if (a>=70&&a<=80){

    System.out.println("Ideal temp");
}
    }

    public static class Fruits {
        public static void main(String[] args) {
            int apples = 50;
            int grapes = 100;
            int bananas =150;

            System.out.println(apples);
            System.out.println("\"This is how many apples we have: " + apples);
            System.out.println("\"This is how many grapes we have: " + grapes);
            System.out.println("\"This is how many bananas we have: " + bananas);





        }
    }

    public static class Computer {
        //Task #4 - day09_tasks.IsStatements.Computer
        //Create a class called day09_tasks.IsStatements.Computer in your Practice_Programming
        //project and inside the day04_tasks package
        //Task:
        //create a main method
        //- Create variables with most appropriate datatypes:
        //brand,
        //processor,
        //ram memory,
        //storage memory,
        //has monitor,
        //has wifi card,
        //description,
        //price,
        //cpu,
        //color,
        //number of monitors,
        //number of usb slots,
        //has usb 3.0
        //- Print out all the variables and values of the
        //computer
        //Hint: You can use escape sequence to make it look nice.
        //day09_tasks.IsStatements.Computer Details
        //Brand: Dell
        //Processor: 8-core Intel Core i9 processor
        //Ram Memory: 16

        public static void main(String[] args) {
            String brand = "Acer";
            String processor = "Intel Core i7";
            double ramMemory = 16.0;
            String storageMemory = "1 TB";
            String monitor = "1080 Full HD";
            boolean wificard = true;
            String decription = "Good condition";
            double price = 890.99;
            String cpu = "Intel";
            String color = "Grey";
            byte numberOfMobitors = 1;
            byte numberOfUsbSlots = 3;
            boolean hasUsb = true;


            System.out.println("day09_tasks.IsStatements.Computer Details" + "\nBrand:\t\t\t\t\t" + brand + "\nProcessor:\t\t\t\t" + processor + "\nRam Memory:\t\t\t\t" + ramMemory + "\nStorage Memory\t\t\t" + storageMemory + "\nMonitor:\t\t\t\t" + monitor + "\nHas a Wifi card\t\t\t" + wificard + "\nDecription:\t\t\t\t" + decription + "\nPrice:\t\t\t\t\t" + price + "\nCPU:\t\t\t\t\t" + cpu + "\nColor:\t\t\t\t\t" + color + "\nNumber of monitors:\t\t" + numberOfMobitors + "\nNumber of Usb Slots:\t" + numberOfUsbSlots +"\nHas USB:\t\t\t\t" +hasUsb);





        }







    }

    public static class CarDriverInfo {


        public static void main(String[] args) {
            String carModel = "Tesla";
            String driverName = "Aytan";
            int licenseNum = 1548796;
            short speed = 300;
            boolean isautomatic = true;
            char licenseClass = 'B';
            System.out.println("My car is: " + carModel + "\nDriver name: " + driverName + "\nLicense number: " + licenseNum + "\nCar Speed: " + speed + "\nCar Type: " + isautomatic + "\nLicense Class: " + licenseClass );




        }






    }
}
