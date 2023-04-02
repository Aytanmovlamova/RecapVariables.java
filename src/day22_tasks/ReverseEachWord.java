package day22_tasks;

import java.util.Arrays;

public class ReverseEachWord {
//Create a class called ReverseEachWord in your Practice_Programming project and inside the day22_tasks package
//
//        Task:
//		Given a String, reverse each individual word and print the result
//
//		Hint: Use a nested loop, split
//
//
//		Input:
//			It started to snow in Chicago
//		Output:
//			tI detrats ot wons ni ogacihC
public static void main(String[] args) {
    String sentence = "It started to snow in Chicago ";
    String[] ters = sentence.split(" " );
    System.out.println(Arrays.toString(ters));
    for (String sen:ters) {
        for (int i = sen.length() - 1; i >= 0; i--) {
            System.out.print(sen.charAt(i));


        }
        System.out.print(" ");


    }
}

}
