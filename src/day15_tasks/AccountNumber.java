package day15_tasks;public class AccountNumber {
    public static void main(String[] args) {

        String accountNumber = "5657753";
        if(accountNumber.length()==7){
            if (accountNumber.startsWith("2")){
                System.out.println("Valid 7-digit account number");
            }else{
                System.out.println("Invalid 7-digit account number");
            }
        } else if (accountNumber.length()==10) {
            if (accountNumber.startsWith("5")){
                System.out.println( "Valid 5-digit account number");
                System.out.println("Invalid 5-digit account number");

            }
            
        }else{
            System.out.println("Invalid account number");
        }


    }
}
