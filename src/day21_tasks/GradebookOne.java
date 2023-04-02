package day21_tasks;

public class GradebookOne {

    public static void main(String[] args) {
        String[] students= {"Adam","Fuad","Aytan","Leila","Sarah"};
        int[] score={100,90,85,80,65};
        char[]grade={'A','B','B','C','D'};
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i] + " "+score[i] + " :"+grade [i]);
            
        }
    }
}
