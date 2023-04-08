package day24_tasks;

public class CurrencyConverter {
    //		create a method that will accept a currency type(String) and a currency amount (double)[as dollars]
    //		and convert the currency from dollars to a different type
    //
    //		Use the following information to convert from given dollars to the desired currency type
    //
    //			1 dollar = 0.91 euro
    //			1 dollar = 121.03 yen
    //			1 dollar = 14.85 lira
    //			1 dollar = 1,217.52 won
    //			1 dollar = 181.45 rupee
    //
    //			Note: Don't worry about decimal formats, focus on method
    //
    //			Ex:
    //				Input:
    //					euro, 100
    //
    //				Output:
    //					91
    //
    //			Ex:
    //				Input:
    //					yen, 50
    //
    //				Output:
    //					6051.5

         public static double currency (String type ,double amount){

        double n =0;

             switch (type){
                 case "euro":
                     n=amount* 0.91;
                     break;
                 case "yen":
                     n=amount*121.03;
                     break;
                 case "lira":
                     n=amount *14.85;
                     break;
                 case "won":
                     n=amount*1217.52;
                     break;
                 case "ruppe":
                     n=amount*181.45;
                     break;
                 default:
                     System.out.println();
             }


             return n;
         }

    public static void main(String[] args) {
        System.out.println(currency("euro",100));

    }
}




