public class DataStructureExercises {

    public static void main(String args[]) {

        //https://www.hackerrank.com/challenges/arrays-ds/problem

        int[]  a = {1, 2, 3};

        a = reverseArray(a);

        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }


    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {

        int temp;
        for(int i=0, j=a.length-1; i<a.length/2; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        return a;
    }

}
