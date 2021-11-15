package Sort_algorithms;

public class Insertion_sort {

    public static void main(String[] args) {
        //these are the elements for the intArray array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //this will loop through the first element that's not sorted, when loop is first started length = 1
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
        {
            //new element is assigned to 35
            int newElement = intArray[firstUnsortedIndex];
            int i;

            //based on the loop, if the index meets all these conditions then execute the inside of the loop
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
            {
                //the index will be swapped with the previous index
                intArray[i] = intArray[i - 1];
            }

            //the index will be assigned the index in newElement variable
            intArray[i] = newElement;
        }

        //this will loop through the new sorted array
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
