package day21_tasks;

public class GradebookTwo {

    public static void main(String[] args) {


        String[] students = {"Mike", "joe", "Ana", "Ali", "Joanna"};
        int[] score = {80, 54, 100, 66, 94};
        char[] grade = {'B', 'D', 'A', 'C', 'A'};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " " + score[i] + " :" + grade[i]);


        }


    }
}
