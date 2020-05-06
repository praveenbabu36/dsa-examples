/**
 * Example 1 for Array as Data Structure
 */
public class ArrayExample1
{
    public static void main(String args[])
    {
        int[] intArray  =   new int[5];

        intArray[0] = 2;
        intArray[1] = 5;
        intArray[2] = -1;
        intArray[3] = 8;
        intArray[4] = 12;

        // Find the index of an element

        int index = -1;
        int elementToFind = 7;

        for(int i=0; i<intArray.length; i++){
            if(intArray[i] == elementToFind){
                index = i;
                break;
            }
        }

        System.out.println("Index of the element \"" + elementToFind + "\" is : " + index);
    }
}
