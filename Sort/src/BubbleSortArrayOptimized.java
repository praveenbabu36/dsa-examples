public class BubbleSortArrayOptimized
{
    public static void main(String args[])
    {
        int[] intArray  =   new int[]{1, 50, 11, 12, 0};

        for(int unsortedPartIdx = intArray.length - 1; unsortedPartIdx>0; unsortedPartIdx--)
        {
            System.out.println("\nUnsorted Partition Index: "+unsortedPartIdx);

            // compare and sort
            for(int i=0; i<unsortedPartIdx; i++){
                System.out.println("    Iteration i: "+i);
                if(intArray[i] > intArray[i+1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                }
            }
        }// end outer unsortedPartIdx for

        // print the array
        for(int i=0; i<intArray.length; i++){
            System.out.println("Value at index " + i + ":" + intArray[i] );
        }

    }
}
