/*
	Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. 
	A single value has a span of 1. Write a function maxSpan() that returns the largest span found in the given array. (Efficiency is not a priority.)
	E.g.,

	maxSpan([1, 2, 1, 1, 3]) returns 4
	maxSpan([1, 4, 2, 1, 4, 1, 4]) returns 6
	maxSpan([1, 4, 2, 1, 4, 4, 4]) returns 6
*/

public class MaxSpan
{
    // NOTE : I have not made a separate function for this question, instead, applied the logic in the main function :)))
    public static void main(String[] args)
    {
        int[] p = new int[args.length];

        int prev = 0;
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < args.length; i++)
        {
	   p[i] = Integer.parseInt(args[i]); // Storing command line inputs in the array nums

        }
	
	// Using two loops to compare every single value of the array with the rest of the values in the array 
        
	for (int i = 0; i < args.length; i++)
        {
            for (int j = 0; j < args.length; j++)
            {
		/*
		  The value at index i of array p would be compared with all of the other elements of array p
		  & if matched would store the result of j - i in in 'count' and increment it (incrementing
		  because count starts from Zero). For example, ([1, 2, 1, 1, 3]) when i = 0, p[i] would be 1.
		  j would be incremneted after every turn which would allow to compare the value 1 stored in p[i]
		  with every value in the array 'p'. Finally, when j would be 3, i.e, last value '1' in the array,
		  count = i - j; would store 3 in count and count would be incremented to store the result '4' in it.
		  Since this count would obviously be greater than the 'maxcount' as there is not any other longest span
		  in the array, this would be our output then.
		*/

                if (p[i] == p[j])
                {
                    count = j - i; // 
		    count++;
                }
		// Everytime the count would be compared to see if it is the greatest count in the array or not
                if (count > maxcount)
                {
                    maxcount = count;
                }

            }
        }
        System.out.println(maxcount);
    }
}


