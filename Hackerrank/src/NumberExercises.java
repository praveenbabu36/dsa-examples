import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExercises {

    public static void main(String args[]) {

        /**
         * Sort
         */
/*        String s[] = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Double d1 = null;
        Double d2 = null;
        String temp = null;

        for(int i=0;i<s.length;i++) {

            for(int j=0; j<s.length-1; j++) {

                System.out.println(s[j]);

                if(! (s[i].trim()).equals("")) {
                    if (new Double(s[j]).doubleValue() < new Double(s[j + 1]).doubleValue()){
                        temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }*/

        // check is probable prime
/*
        BigInteger a = new BigInteger("7");
        System.out.println(a.isProbablePrime(1));
*/

        // Factorial Example
/*        int result = factorial(3);
        System.out.println(result);*/

/*        //Integer to Binary
        int n = 439;
        String binary_ = Integer.toBinaryString(n);
        System.out.println(binary_);

        int maxOneOccurances = 0;
        int numOneOccurances = 0;

        for(int i = 0; i<binary_.length(); i++) {
            if(binary_.charAt(i) == '1') {
                numOneOccurances++;
            }else{
                if(numOneOccurances >= maxOneOccurances) {
                    maxOneOccurances = numOneOccurances;
                }
                numOneOccurances = 0;
            }
        }
        if(numOneOccurances >= maxOneOccurances) {
            maxOneOccurances = numOneOccurances;
        }
        System.out.println(maxOneOccurances);*/


        /**
         * find apples and oranges
         */
/*        int[] apples = {2, 3, -4};
        int[] oranges = {3, -2, -4};
        countApplesAndOranges(7, 10, 4, 12, apples, oranges);*/

        /**
         * find pairs
         */

        /*int n = 1;
        int[] ar =  {10};

        Arrays.sort(ar);

        int countPairs = 0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                countPairs++;
                i++;
            }
        }

        System.out.println(countPairs);*/

        /**
         *  Kangaroo:
         *  It should return YES if they reach the same position at the same time,
         *    or NO if they don't.
         */
/*        System.out.println( kangaroo(43, 2, 70, 2) );*/

        /**
         * Between Two Sets
         */
        /*List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(6);

        List<Integer> brr = new ArrayList<>();
        brr.add(24);
        brr.add(36);
        //brr.add(96);

        List<Integer> arr1 = new ArrayList<>();
        for(int i=1; i<=brr.get(0); i++) {
            boolean divideFlag = false;

            for(int j=0; j<arr.size(); j++){
                //System.out.print(i + " " + arr.get(j));
                if( (i % arr.get(j) ) == 0 ) {
                    divideFlag = true;
                }else{
                    divideFlag = false;
                    break;
                }
                //System.out.println(" " + divideFlag);
            }

            if(divideFlag) {
                arr1.add(i);
            }

        }

        //System.out.println(arr1 + " " + arr1.size());
        //System.out.println(brr + " " + brr.size());

        List<Integer> arr2 = new ArrayList<>();

        for(int i=0; i<arr1.size(); i++) {

            boolean divideFlag = false;


            for(int j=0; j<brr.size(); j++){
                //System.out.println();
                //System.out.print( brr.get(j) + " " + arr1.get(i) );
                if( (brr.get(j) % arr1.get(i) ) == 0 ) {
                    divideFlag = true;
                }else{
                    divideFlag = false;
                    break;
                }

                //System.out.print(" " + divideFlag);

            } // end for

            if(divideFlag) {
                arr2.add(arr1.get(i));
            }

        }// outer for

        System.out.println(arr2);*/

        /**
         * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
         */
        //int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] scores = {3, 4, 21, 36, 10, 28, 35};

        int highScore = 0;
        int lowScore  = 0;

        int highCount = 0;
        int lowCount  = 0;

        int[] result = new int[2];

        for(int i=0; i<scores.length; i++) {

            if(i==0) {
                highScore = scores[0];
                lowScore = scores[0];
            }

            if(scores[i] > highScore) {
                highScore = scores[i];
                highCount++;
            }

            if(scores[i] < lowScore) {
                lowScore = scores[i];
                lowCount++;
            }
        }

        result[0] = highCount;
        result[1] = lowCount;

        System.out.println(highCount + " " + lowCount);


    }

    //Between Two Sets
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        return 1;
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

        if ( (x1>=x2 && v1 >= v2) || (x2 >= x1 && v2>=v1) ) {
            return "NO";
        }
        if( ((x1-x2) % (v1-v2)) == 0 )
            return "YES";
        else
            return "NO";


    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for(int i : apples){
            if ( (a + i) >= s && (a+i) <= t) {
                appleCount ++;
            }
        }

        for(int i : oranges){
            if ( (b + i) >= s && (b+i) <= t) {
                orangeCount ++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

    static int factorial(int n) {

        if(n<=1)
            return n;
        else
            return n = n * factorial(n-1);
    }

}
