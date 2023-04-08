package day09_tasks;

import java.util.Scanner;

public class GradeAfterRetake {
    //Tasks 1 - GradeAfterRetake
    //
    //    First for practice Do NOT need create a class for this. You can answer what is the output.
    //
    //    Once you have your answers then you can create a class called GradeAfterRetake in your Practice_Programming project and inside the day09_tasks package. You can put all tasks in one class
    //
    //
    //        Task:
    //    		Write a program that will give the grade after the retake.
    //    		The program should read a score of the test and which attempt it was.
    //        		If its the first attempt -> subtract 10%
    //        		If its the second attempt -> subtract 20%
    //        		If its the third attempt -> subtract 35%
    //
    //		Note: Use Scanner class
    //
    //		Example Output:
    //			Put your score:
    //			70
    //			Which attempt is this to retake the test?
    //			2
    //			After the second retake attempt, your score is: score
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("Put your score:");
        double score = input.nextInt();
        System.out.println("Which attempt is this to retake the test?");
        int attemt = input.nextInt();
        if (attemt==1) {
            score =score-(score * 0.10);
        }
        else if ( attemt == 2 ) { score = score - ( score * 0.20) ; }
        else if ( attemt == 3 ) { score = score - ( score * 0.35) ; }


        System.out.println("After the " + attemt + " retake attempt, your score is " + score);



    }



}
