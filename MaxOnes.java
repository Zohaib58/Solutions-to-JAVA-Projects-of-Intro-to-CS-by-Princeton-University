/*
	Write a program MaxOnes.java that given an array of integers, find the maximum number of consecutive 1's present in the array.

	e.g,
	{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0} --> 4
	{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1} --> 1
*/

public class MaxOnes
{
    public static void main(String[] args)
    {
        int count = 0;
        int sum = 0;
        int[] a = new int[args.length]; // Declaring array a to be of the length equal to the number of command-line arguments provided by the user 
        int result = 0;
	int length = (args.length);

        for (int i = 0; i < (length); i++)
        {
            a[i] = Integer.parseInt(args[i]);  // To store command line inputs in array
        }

	/*
	  The following code traverses array a and whenever a[j] is equal to zero it makes count equals to zero too.
          Otherwise it increments the count and keeps saving the value of 'count' into the variable result whenever 'count' is greater than the 'result'.
	*/

        for (int j = 0; j < (length); j++)
        {
           if (a[j] == 0) count = 0;
           else
           {
               count++;
               if (count > result) result = count;
           }


        }
        System.out.println(result); // Displays the maximum number of ONES
    }
}
