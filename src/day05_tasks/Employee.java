package day05_tasks;

public class Employee {

    public static void main(String[] args) {
        String firstName = "Aiten";
        String lastName = "Movlamova";
        String companyName = "Spark";
        double salary = 2.750000;
        byte startDay = 13;
        byte startmonth = 01;
        short starYear = 2020;
        boolean areTheyFullTime = true;
        String jobTitle = "Art School";
        String officeAdress = "4554 Superior Sq";

        String fullNAme = (firstName + " " + lastName);
        String fullStartDate = (startmonth + "/" + startDay + "/" + starYear);
        String email = (firstName + startDay + "@$"+ companyName + ".com");
        double salaryAfter3Years = (2.750000 * 3);
        System.out.println();
        System.out.println("Emoloyee Information" + "\nFull name:\t\t\t\t" + fullNAme + "\nStart Date:\t\t\t\t" + fullStartDate + "\nE-mail:\t\t\t\t\t" + email + "\nSalary After 3 yerar:\t" + salaryAfter3Years +"\nJob Title:\t\t\t\t" + jobTitle +  "\nOffice adres:\t\t\t" +officeAdress   );


    }


}
