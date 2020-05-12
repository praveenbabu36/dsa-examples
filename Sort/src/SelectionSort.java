public class SelectionSort
{

    public static void main(String args[])
    {
        int[] intArray  =   new int[]{1, 50, -1, 12, 0, 12};

        // print the array - start
        System.out.print("Start Array : " );
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        for(int unsortedPartIdx = intArray.length; unsortedPartIdx > 0; unsortedPartIdx--)
        {
            System.out.println("UnsortedPartIdx: " + unsortedPartIdx);

            int largest = 0; // index of largest element as first element
            for (int i = 1; i < unsortedPartIdx; i++) {

                System.out.println("   largest: " + largest  + " i:" + i);

                //if element in the array is larger, change the index of the larger element
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            // move the larger item to the unsorted partition index position
            int temp = intArray[unsortedPartIdx - 1];
            intArray[unsortedPartIdx - 1] = intArray[largest];
            intArray[largest] = temp;

            // print the array - end
            System.out.print("End Array : " );
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + " ");
            }
            System.out.println();

        } //end for outer
    }
}
