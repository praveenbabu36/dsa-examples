public class InsertionSort
{

    public static void main(String args[])
    {
        int[] intArray  =   new int[]{20,35,-15,7,55,1,-22};

        // print the array - start
        System.out.print("Start Array : " );
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        int unsortedIndex = 1;

        for(int i=0; i<intArray.length; i++) {

            //break when everything is sorted
            if(unsortedIndex == intArray.length)
                break;

            // element to be sorted
            int newElement = intArray[unsortedIndex];

            // if the element to be sorted is less than the previous element
            if(newElement < intArray[i]) {

                //move the larger element to right
                intArray[unsortedIndex] = intArray[i];

                // traverse the loop from current position to starting position
                //   and compare the elements
                int insertPos = -1;

                for(int j=i-1;j>=0;j--){
                    if(newElement < intArray[j]) {
                        intArray[j+1] = intArray[j]; // move large element to right
                        insertPos = j; //save the last position where move to right happenned
                    }
                }

                if(insertPos != -1) // insert the element to sorted at the right position
                    intArray[insertPos] = newElement;
            }

            unsortedIndex += 1;
        }

        // print the array - end
        System.out.print("End Array : " );
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

    }
}
