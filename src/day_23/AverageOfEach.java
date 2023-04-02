package day_23;

import java.util.Arrays;

public class AverageOfEach {
    //Create a class called AverageOfEach in your Practice_Programming project and inside the day23_tasks package
    //
    //        Task:
    //
    //                Given a 2D array find the average of each inner array
    //                This is extra if you can: average of the whole array
    //
    //                Ex:
    //
    //                    3, 4, 5, 6
    //                    5, 2, 6
    //                    10, 20, 30
    public static void main(String[] args) {
        int [][] num ={{3, 4, 5, 6},
                      {5, 2, 6},
                      {10, 20, 30}};
//        int num1 =num[0][0]+num[0][1] +num[0][2] + num [0][3];
//        System.out.println(num1/num[0].length);
//        int num2 =num[1][0]+num[1][1] +num[1][2];
//        System.out.println(num2/num[1].length);
//        int num3 =num[2][0]+num[2][1] +num[2][2];
//        System.out.println(num3/num[2].length);
//       int wholeNum = num1 + num2 +num3;
//        System.out.println(wholeNum/num.length);

        for (int[]number:num) {
            double number1 = 0;
            System.out.println(Arrays.toString(number));
            for (int i = 0; i < num.length; i++) {
                number1+=number[i];
            }
            System.out.println(number1/num.length + "");
        }
    }

}
