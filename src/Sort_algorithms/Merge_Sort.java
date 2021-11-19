package Sort_algorithms;

public class Merge_Sort {
    public static void main(String[] Args)
    {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(array, 0, array.length);

        //looping through the sorted array
        for(int i = 0; i < array.length; i++)
        {
            //print out the sortewd array
            System.out.println(array[i]);
        }
    }

    //{20, 35, -15, 7, 55, 1, -22};
    public static void mergeSort(int[] input, int start, int end)
    {
        //this will execute if the array contains only 1 element
        if(end - start < 2)
        {
            //do nothing
            return;
        }

        //it will add the starting index plus the length of the array
        int mid = (start + end) / 2;

        //this will keep splitting the left side of array until all the elements from the left side has been sorted
        //this is saying that the start = first index of the array which is 0, and end = array.length = 7 and midpoint = (0 + 7)/ 2 = 3
        // left side of array = {20, 35, -15}
        mergeSort(input, start, mid);

        //this will keep splitting the right side of array until all the elements from the right side have been sorted
        //right side of array = {7, 55, 1, -22}
        //this is saying that the start(mid) = index 3, and end = length 7 and midpoint = (3 + 7)/ 2 = 5
        mergeSort(input, mid, end);

        //this will merge the sorted left side of the array, and the sorted right side of the array
        merge(input, start, mid, end);

    }

    //{20, 35, -15, 7, 55, 1, -22};
    public static void merge(int[] input, int start, int mid, int end)
    {
        //mid - 1 is the last element in the lest side of the array
        //mid is the first element on the right side of the array
        //left side of the array after sorted is {-15, 20, 35}, right side of the array after sorted is {-22, 1, 7, 55}
        //so if mid - 1 was less than or equal to mid, that means they can be merged together since the last element
        // on the left side of the array is less than the first element on the right side of the array,
        // that means all the element on the left side are less than the elements on the right side of the array, so if merged the whole array will be sorted from least to greatest
        if(input[mid - 1] <= input[mid])
        {
            //do nothing
            return;
        }

        //index i in right array
        int i = start;
        //index j in left array
        int j = mid;
        //keep track of where we are in the temporary array
        int tempIndex = 0;

        //so for {20, 35, -15, 7, 55, 1, -22}
        // temp array = int[array.length - starting index] = int[7 - 0] = int[7]
        int[] temp = new int[end - start];

        //as soon as were done iterating the left side of the array(i) we wanna drop out of the loop
        //or as soon as we're done iterating the right side of the array(j) we wanna drop out of the loop
        while(i < mid && j < end)
        {
            //if the element in the left side of the array(i) is less than or equal to the element on the right side of the array(j)
            //we're going to assign the current index in the temp array with the current element on the left side of the array(i) go to next index of the left side of the array
            //else, we're going to assign the current index in the temp array with the current element on the right side of the array(j), go to next index of the right side of the array
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //input is the array with the remaining element
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}
