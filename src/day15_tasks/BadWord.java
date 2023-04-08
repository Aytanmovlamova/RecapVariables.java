package day15_tasks;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        //Task #3 - BadWord
        //
        //    Create a class called BadWord in your Practice_Programming project and inside the day15_tasks package
        //
        //        Task:
        //    		Given a String variable with a message.
        //    		You will check if the message contains any of these bad words: “idiot, dumb, heck”
        //
        //        		If the message contains any of those words print: “Message not sent”.
        //        		If the message is bad word free print “Message sent”

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text :");
        String msg = input.nextLine();
        boolean badWord = msg.contains("idiot")||msg.contains("dumb")||msg.contains("heck");
        if (badWord){
            System.out.println("Message not send");
        }else {
            System.out.println("Message sent");
        }

    }
}
