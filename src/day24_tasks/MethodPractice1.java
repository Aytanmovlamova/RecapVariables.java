package day24_tasks;

public class MethodPractice1 {
    // Task:
    //		create a method that can print odd numbers between 1-100 in the
    //		same line saperated by space
    //
    //		create a method that can print even numbers between 1-100 in the
    //		same line saperated by space


    public static void odd() {
        System.out.println("Odd number:\n");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ",");

            }
        }

    }

        public static void even () {
            System.out.println("\nEven number:\n");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }

            }

        }
        public static void main (String[]args){
            odd();

            even();
        }
    }
