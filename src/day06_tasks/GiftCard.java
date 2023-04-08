package day06_tasks;

public class GiftCard {

    //Task:
    //add main method
    //-Declare variables for gift card
    //balance, item1 price, item2 price and give
    //them values 200, 40, 100 respectively
    //-Decalare a variable for remaining
    //gift card balance and calculate it based on
    //the information above
    //-Print out the following:
    //"The gift card started with a
    //balance of $xxx and after buying item1 for
    //$xxx and item2 for $xxx,
    //the remaining balance of the
    //gift card is $xxx"
    //Note: use the variables for the
    //appropriate places.
    //---------------------------------------
    public static void main(String[] args) {
        int giftCardbalance = 200;
        double item1 =40;
        double item2 =150;
        double remaningGiftCardBalance = giftCardbalance-item1-item2;
        System.out.println("The gift card started with a balance of  $" +giftCardbalance+  " and after buying item 1 for $" +item1+" and  item 2 for $" + item2 + ", the remanin balance of the gift card is  $"+remaningGiftCardBalance +".");

    }


}
