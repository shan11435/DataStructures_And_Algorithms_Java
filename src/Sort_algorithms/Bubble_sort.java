package Sort_algorithms;
//bubble sort algorithm is a stable sort algorithm because when 2 duplicate elements are being compared,
// they won't be swapped and the sorted array list will keep them at a relative position
public class Bubble_sort {

    public static void main(String[] args) {
        //these are the elements for the intArray array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //this will start at index 6 then go down, and then the element will go to the sorted side
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //after looping through all the iterations, the iterations will be subtracted by 1
            for (int i = 0; i < lastUnsortedIndex; i++) {
                //if element at index i is greater than the element at the next index
                if(intArray[i] > intArray[i + 1])
                {
                    //swap the two elements
                    swap(intArray, i , i + 1);
                    //it will go to outer loop once i reaches 6, then i reaches 5, etc.
                }
            }
            //the array has now been fully sorted from least to greatest
        }


        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }




    //i and j are the elements that we are comparing to see if they shou;d be swapped in the array
    public static void swap(int[] array, int i, int j)
    {
        if(i == j)
        {
            //do nothing
            return;
        }
        //temp will be assigned the element in position i
        int temp = array[i];
        //the element in position i will now be assigned the element in position j
        array[i] = array[j];
        //the element in position j will be assigned the temp variable
        array[j] = temp;
    }
}
