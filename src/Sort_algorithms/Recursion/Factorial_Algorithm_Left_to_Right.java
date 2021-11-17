package Sort_algorithms.Recursion;

public class Factorial_Algorithm_Left_to_Right {
    public static void main(String[] Args)
    {
        System.out.println(iterativeFactorial(10));
        System.out.println(recursiveFactorial(10));
    }

    public static int recursiveFactorial(int num)
    {
        //if we removed this block of code a stackoverflow error would occur
        //basically the code will keep printing infinitely
        if(num == 0)
        {
            return 1;
        }

        //this will multiple the num value with the recursive answer of num - 1
        return num * recursiveFactorial(num - 1);
    }

    //this runs better than the recursivefactorial method but the recursivefactorial method is preffered because developers can read it better
    public static int iterativeFactorial(int num)
    {
        //if the argument for the method is 0
        if(num == 0)
        {
            return 1;
        }

        //initialize the variable
        int factorial = 1;
        //loops through the num value
        for(int i = 1; i <= num; i++)
        {
            //multiplies factorial with the first iteration and so on
            factorial = factorial * i;
        }

        //method should print out the factorial value
        return factorial;
    }
}
