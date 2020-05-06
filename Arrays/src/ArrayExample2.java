/**
 * Example 2 for Array as Data Structure
 */
public class ArrayExample2
{
    public static void main(String args[])
    {
        int[] intArray  =   new int[5];

        intArray[0] = 2;
        intArray[1] = 5;
        intArray[2] = -1;
        intArray[3] = 8;
        intArray[4] = 12;

        // find element -1 and replace it with value 100
        int index = -1;
        int elementToFind = -1;
        int valueToReplace = 100;

        for(int i=0; i<intArray.length; i++) {
            if(intArray[i] == elementToFind) {
                intArray[i] = valueToReplace;
            }
        }

        for(int i=0; i<intArray.length; i++){
            System.out.println("Value at index " + i + ":" + intArray[i] );
        }

    }
}
