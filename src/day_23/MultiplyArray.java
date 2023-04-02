package day_23;

public class MultiplyArray {
    // Create a class called MultiplyArray in your Practice_Programming project and inside the day23_tasks package
    //
    //        Task:
    //            Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation
    //
    //		Ex:
    //
    //			{1, 2, 3}
    //			{2, 5, 10}
    //			{0, 3, 20}
    //
    //				x
    //
    //			{10, 4, 3}
    //			{5, 2, 7}
    //			{100, 20, 5}
    //
    //		Output:
    //
    //			{10, 6, 9}
    //			{10, 10, 70}
    //			{0, 60, 100}
    //
    public static void main(String[] args) {
        int[][]a= {{1, 2, 3},
                {2, 5, 10},
                {0, 3, 20}} ;
        int[][]b ={{10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}};


            System.out.println(a[0][0] * b[0][0] +","+a[0][1]*b[0][1]+ ","+a[0][2]*b[0][2]);
            System.out.println(a[1][0] * b[1][0] +","+a[1][1]*b[1][1]+ ","+a[1][2]*b[1][2]);
            System.out.println(a[2][0] * b[2][0] +","+a[2][1]*b[2][1]+ ","+a[2][2]*b[2][2]);
            }

        }






