package day21_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {


        int[] number = new int[100];
        for (int i = 1; i <=100 ; i++) {
            number[i-1]=i;

        }
        System.out.println(Arrays.toString(number));



        }
    }
