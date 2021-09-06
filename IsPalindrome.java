/*
	Write a function isPalindrome that returns true if and only if the input string is palindrome 
	(A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as Madam or Racecar or the number 10201.)
*/

public class IsPalindrome
{
    /*

	This function converts the string into lowercase to maintain consistency then runs the loop until half of the string and compares each letter from both halves,
	respectively. For e.g., 1st & last, 2nd & 2nd last..
	If unequal, the function returns false to main, otherwise it keeps checking until the loop executes.
	If the palindrome is being established, and at any point the comparison is not unequal in the loop, then true is returned to the main program signifying 
	that palindrome exists.

    */
    public static boolean isPalindrome(String data)
    {
        data = data.toLowerCase();
        for(int i = 0, length = data.length(); i < length/2; i++)
        {
            if (data.charAt(i) != data.charAt(data.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String data = args[0];
        System.out.println(isPalindrome(data));

    }
}
