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
        }

    }

    //
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        //System.out.println(arr.get(i));
        for(int i=0; i<d; i++) {
            arr.add(arr.remove(0));
        }

        return arr;
    }

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
