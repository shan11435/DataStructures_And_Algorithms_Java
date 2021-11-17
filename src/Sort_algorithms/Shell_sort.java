package Sort_algorithms;

public class Shell_sort {

    public static void main(String[] args) {
        //these are the elements for the intArray array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //this will loop using shell sort first iteration gap = 3, second iteration gap will = 1 because 3 /= 2 = 1
        for(int gap = intArray.length / 2; gap > 0; gap /= 2)
        {
            //the first iteration will start at the gap number which is 3
            for(int i = gap; i < intArray.length; i++)
            {
                //new element = 7 because intArray[3] = 7
                int newElement = intArray[i];
                //assigning variable j to i, j = 7 or j = intArray[3]
                int j = i;
                //a while loop will happen if 3 >= 3 and intArray[0] > intArray[3]
                while(j >= gap && intArray[j - gap] > newElement)
                {
                    //intArray[3] will now be assigned to intArray[3 - 3] which is intArray[0]
                    intArray[j] = intArray[j - gap];
                    //j will now be 3 - 3 which is 0
                    j -= gap;
                }

                //intArray[0] will now be assigned to newElement
                intArray[j] = newElement;
            }
        }

        //this will loop through the new sorted array
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
