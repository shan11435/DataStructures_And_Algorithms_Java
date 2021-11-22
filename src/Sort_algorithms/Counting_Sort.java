package Sort_algorithms;

public class Counting_Sort {
    public static void main(String[] Args)
    {
        int[] array = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
        countingSort(array, 1, 10);

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    //this will take the array, the range of values from min to max
    public static void countingSort(int[] input, int min, int max){
        //this will create a count Array of length 10 because the max will be 10 and min will be 1
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            //example
            //i = 0
            //countArray[input[0] - 1]
            //countArray[2 - 1] = countArray[1]
            //and then it will add the number into the array (increment the value in the index position by 1)
            countArray[input[i] - min]++;
        }

        //write the values back into input array
        //j is the index we're going to use to write to the input array
        int j = 0;
        //looping the count array
        for(int i = min; i <= max; i++){
                while(countArray[i - min] > 0){
                    //input the element in index i of count array into input array
                    input[j++] = i;
                    //decrement the count by 1 and go back to while loop
                    countArray[i - min]--;
                }
            }

        }
    }
