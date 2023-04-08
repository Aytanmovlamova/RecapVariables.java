package day06_tasks;

public class TicketPrice {

    //Task:
    //add main method
    //declare two variables and assign
    //city1 = "Chicago"
    //city2 = "Virginia"
    //base ticket price = 110.50
    //miles between cities = 739.8
    //ticket price = add to the base
    //ticket price by dividing miles by 10
    //Example output:
    //The ticket price from
    //city1 to city2 is $ticketPrice"
    public static void main(String[] args) {
        String city1 = "Chicago";
        String city2 = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCties = 739.8;
        double ticketPrice = baseTicketPrice+ (milesBetweenCties-10);
        System.out.println("The ticket price from " +city1+ " to " +city2+ " is "+ticketPrice);
    }


}
