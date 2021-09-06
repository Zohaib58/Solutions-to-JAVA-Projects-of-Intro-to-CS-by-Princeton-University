/*
	Write a recursive implementation of isPalindrome from Exercise 2.
	Ex2: Write a function isPalindrome that returns true if and only if the input string is palindrome 
	(A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as Madam or Racecar or the number 10201.)
*/

public class RecursiveIsPalindrome
{
    public static boolean recursiveisPalindrome(String data, int n)
    {
        data = data.toLowerCase(); // Converting the string into lowercase to maintain consistency
        boolean x = true; // Every stack having this function would be opened with x initialized to true 
	
	/*

	  The function takes in two parameters:
	  1. String to be checked
 	  2. Counter variable 'n' which controls the characters in the string that are compared

	  The function has two base cases:
	  
          1. If the variable 'n', serving as counter for the number of characters checked, reaches halfway then return true
             because this function compares the characters respectively by splitting the string into half so 'n' reaching halfway means 
	     that palindrome exists, otherwise, false would have been returned.

	  2. If the characters compared are unequal then store 'false' in boolean variable 'x' and return it.
		
	  If the two base-cases are not met then the function calls itself with the same string and n+1 as the two arguments
 
	*/
        if (n == data.length()/2) return x; // base-case
        if (data.charAt(n) != data.charAt(data.length()-1-n)) // base-case
        {
            x = false;
            return x;
        }
        else
        {
            return recursiveisPalindrome(data, n+1);
        }

    }
    public static void main(String[] args)
    {
        int n = 0;
        String data = args[0];
        System.out.println(recursiveisPalindrome(data, n));

    }
}

