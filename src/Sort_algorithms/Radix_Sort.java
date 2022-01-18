package Sort_algorithms;

public class Radix_Sort {
    public static void main(String[] Args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        //this method will make the numbers sort from least to greates
        radixSort(radixArray, 10, 4);

        //this will print out the sorted array
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    /*it assumes the array has the same radix and width
      width is the length of the element in the array
      and radix is the number of possible digits, digit 0 - 9
    */
    public static void radixSort(int[] input, int radix, int width) {
        /* width will be 4 because each element has 4 digits
           this will start with the digit from right to left
           start sorting with digits from the 1's position, 10's position, etc.
        */
        for (int i = 0; i < width; i++) {
            //this will sort the values in each i position
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        //numItems will equal the number of elements in the array
        int numItems = input.length;
        //the countArray array will have an array with length 10 because with radix there are 10 possible digits, digits 0 - 9
        int[] countArray = new int[radix];

        /*
          for every value in our input array
          we are going to count how many of the digits we have in the 1's position
         */
        for (int value : input) {
            //this will count every digit
            countArray[getDigit(position, value, radix)]++;
        }

        //adjust the count array
        //this step is responsible for making the sort stable
        for(int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix) {
        /*lets say i = 0
          so we will be looking at 4725
          position is 1 so position = 0
          value will be the element in index 0 so 4725
          radix = 10 because 10 possible digits from 0 to 9
          return 4725 / (int) Math.pow(10, 0) % 10
          4725 / 10^0 % 10
          4725 / 1 = 4725
          4725 / 10 = 472 and the remainder is 5
          so it would return the remainder after dividing by 10 which is 5
        */
        return value / (int) Math.pow(radix, position) % radix;
    }
}

