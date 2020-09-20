import java.util.*;
public class ArrayExercises {
        public static void main(String args[]) {

            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            String s = scan.nextLine();
            scan.close();
/*
            int n = 5;
            String s = "1 -2 4 -5 1";*/

            String[] sArray = s.split("\\s");
            int[] numberArray = new int[n];

            for(int i=0;i<n; i++) {
                numberArray[i] = Integer.parseInt(sArray[i]);
            }

            int negSubArrCount = 0;
            int sumArr = 0;
            for(int range =1; range<=n; range++) {
                for (int i = 0; i < n && i+range <= n; i++) {
                    sumArr = 0;
                    int[] newArr = Arrays.copyOfRange(numberArray, i, i + range);
                    for (int j = 0; j < newArr.length; j++) {
                        System.out.print(newArr[j] + " ");
                        sumArr += newArr[j];
                    }
                    if(sumArr < 0) {
                        negSubArrCount++;
                    }
                    System.out.println();
                }
            }

            System.out.println(negSubArrCount);
        }
}
