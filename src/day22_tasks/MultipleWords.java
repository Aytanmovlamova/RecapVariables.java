package day22_tasks;

import java.util.Arrays;

public class MultipleWords {
    //Create a class called MultipleWords in your Practice_Programming project and inside the day22_tasks package
    //
    //        Task:
    //                Given a String of words that are separate by commas. Find and print any words that have more than one word
    //
    //
    //		Example
    //
    //			Input: knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
    //
    //		Output:
    //			wooden spoons
    //			trash can
    //			dish washer

    public static void main(String[] args) {
        String kitchen ="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] name = kitchen.split(", ");
        System.out.println(Arrays.toString(name));
        String name2 =  "";

        for (int i = 0; i < name.length; i++) {
            if (name[i].contains(" ")){
                name2+=name[i]+"\n ";
            }


        }
        System.out.println(name2);
    }

}
