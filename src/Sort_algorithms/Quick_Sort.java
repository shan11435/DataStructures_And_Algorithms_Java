package Sort_algorithms;

public class Quick_Sort {
    public static void main(String[] Args)
    {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        quickSort(array, 0, array.length);

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end)
    {
        //if it's only one element in array
        if(end - start < 2)
        {
            //return the array (do nothing)
            return;
        }

        //this is returning the pivot position where everything to the left of it is less than the pivot
        //this is returning the pivot position where everything to the right of it is greater than the pivot
        int pivotIndex = partition(input, start, end);
        //this will sort the left side side of the pivot index
        quickSort(input, start, pivotIndex);
        //this will sort the right side of the pivot index
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end)
    {
        //this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //while starting index is less than end index
        while(i < j)
        {
            //empty loop body
            //start with the end index and moving from right to left
            //has to meet all the condition in the while loop statement
            while(i < j && input[--j] >= pivot);
            //if index i is less than index j
            if( i < j)
            {
                //swap the element in position i with the element in position j
                input[i] = input[j];
            }

            //empty loop body
            //start with the starting index and moving from left to right
            //has to meet all the condition in the while loop statement
            while(i < j && input[++i] <= pivot);
            //if index i is less than index j
            if(i < j)
            {
                //swap the element in position j with the element in position i
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;

    }
}
