import java.util.ArrayList;
import java.util.List;

public class DataStructureExercises {

    public static void main(String args[]) {

        //https://www.hackerrank.com/challenges/arrays-ds/problem
/*
        int[]  a = {1, 2, 3};

        a = reverseArray(a);

        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }*/

/*
        //https://www.hackerrank.com/challenges/array-left-rotation/problem
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int d = 2;

        List<Integer> result = rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("result:" + result.get(i));
        }*/

        //https://www.hackerrank.com/challenges/30-2d-arrays/problem

        int[][] arr = new int[6][6];

/*        String[] inputStr = {"1 1 1 0 0 0",
                             "0 1 0 0 0 0",
                             "1 1 1 0 0 0",
                             "0 9 2 -4 -4 0",
                             "0 0 0 -2 0 0",
                             "0 0 -1 -2 -4 0"};*/

        String[] inputStr = {"-1 -1 0 -9 -2 -2",
                             "-2 -1 -6 -8 -2 -5",
                             "-1 -1 -1 -2 -3 -4",
                             "-1 -9 -2 -4 -4 -5",
                             "-7 -3 -3 -2 -9 -9",
                             "-1 -3 -1 -2 -4 -5"};


        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = inputStr[i].split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(max2DArrayValue(arr));
    }

    public static int max2DArrayValue(int[][] arr) {

       int row = 0;
       int col = 0;
       int max2DSum = 0;
       int max2DSumTemp = 0;

        //rows to traverse
       for(int i=0; i<4; i++){

           //column
           for(int j=0; j<4; j++){
               max2DSumTemp = 0;
               System.out.println("---------------");
               //3 rows
               row = 0;
               for (int ii = i; ii <= i + 2; ii++) {
                   col = 0;
                   System.out.println();
                   //3 columns
                   for (int jj = j; jj <= j + 2; jj++) {
                        System.out.print(i + "," + j + "->:" + arr[ii][jj] + " ");
                        if(row == 1) {
                            if(col == 1)
                                max2DSumTemp += arr[ii][jj];
                        }else {
                            max2DSumTemp += arr[ii][jj];
                        }


                        col++;
                   }
                   row++;
               }

               if(i == 0 && j ==0)
                   max2DSum = max2DSumTemp;


               if(max2DSumTemp > max2DSum)
                   max2DSum = max2DSumTemp;

               System.out.println("\n max2DSumTemp: " + max2DSumTemp + ", maxSum:" + max2DSum) ;
           }
       }

        return max2DSum;
    }

    // rotateLeft Array
/*    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        //System.out.println(arr.get(i));
        for(int i=0; i<d; i++) {
            arr.add(arr.remove(0));
        }

        return arr;
    }*/

    // Complete the reverseArray function below.
/*    static int[] reverseArray(int[] a) {

        int temp;
        for(int i=0, j=a.length-1; i<a.length/2; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        return a;
    }*/
}
