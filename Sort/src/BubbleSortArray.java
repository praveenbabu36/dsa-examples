public class BubbleSortArray
{
    public static void main(String args[])
    {
        int[] intArray  =   new int[]{8, 50, -1, 12, 0};

        for(int j=0; j<intArray.length; j++)
        {
            // compare and sort
            for(int i=0; i<intArray.length-1; i++){

                System.out.println("    Iteration : " + j + " " + i);
                if(intArray[i] > intArray[i+1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                }
            }
        }// end outer for

        // print the array - end
        for(int i=0; i<intArray.length; i++){
            System.out.println("Value at index " + i + ":" + intArray[i] );
        }
    }
}
