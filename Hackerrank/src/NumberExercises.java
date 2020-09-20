import java.math.BigInteger;
import java.util.Arrays;
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
