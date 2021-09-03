/*
	Write a recursive function count7() that given a non-negative integer n, returns the count of the occurrences of 7 as a digit, so for example 717 yields 2. 
	Following are some examples :

	count7(7170123) is 2
	count7(7) is 1
	count7(123) is 0
	
	Hint: Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
*/

public class Count7
{
    /* 
     Function that counts and returns number of 7 in a non-negative integer
     1231 = 0
     1787 = 2
     7897 = 2
     127 = 1
     777 = 3
    */

    public static int count7(int n, int count) // Function takes in two parameters, n and count, of integer data types
    {
        /* 
          Since, we do not know the length of a non negative integer recursion will happen until we get 0 by dividing n by 10
          
	  Q)  Why have we type-casted in (double)?
          Ans) For example, in 127 after eliminating 7 and 2, 1/10 would still give 0, if not type casted to double
        */

        if ((double) n / 10 == 0) return count; // Base Case

        // If 7 is found in the non-negative integer, increment the value of variable count
        if (n % 10 == 7) count++; // If we are working with 1787, 1787 mod 10 would give 7 that would increment the count to 1
        return count7(n / 10, count); // dividing 1787 by 10 would return 178. Now function would work with 178 and return 17 upon reaching this line and so on

    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]); // Value n taken as an input
        int count = 0;
        System.out.println(count7(n, count)); // The value returned from the function is being displayed directly
    }
}

