package day23_tasks;

public class BiggestDiagonal {

    public static void main(String[] args) {

        int[][] arr = {{3, 5, 6},
                {1, 6, 10},
                {5, 21, 10}};

        System.out.println(arr[0][0] + arr[1][1] + arr[2][2]);
        System.out.println(arr[1][0] + arr[1][1]+arr[0][2]);
    }


}