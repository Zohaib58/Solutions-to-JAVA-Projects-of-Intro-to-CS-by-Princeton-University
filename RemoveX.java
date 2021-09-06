/*
	Write a recursive function removeX that given a string, compute recursively a new string where all the 'x' characters have been removed. E.g.,

	removeX("xaxb") returns "ab"
	removeX("abc") returns "abc"
	removeX("xx") returns ""
	Hint: All occurrences of 'x' in string s can be removed by removing 'x' from first position (if exists) and recursively removing 'x' from the rest
*/

public class RemoveX
{
    public static String removeX(String data, String y)
    {
        if (data.length() == 0) // base-case
	{
	   return y;
	} 

	// If the last character of the string is not X, then store that character in the variable 'y' in reverse order
        if (data.charAt(data.length()-1) != 'x') 
	{
	   y = data.charAt(data.length()-1) + y; 
        }
        // Recursing function and sending the string with one character less, along with another string y that contains non 'X' characters
	return removeX(data.substring(0, data.length()-1),y);
    }
    public static void main(String[] args)
    {
        String data = args[0];
        String y = "";
        System.out.println(removeX(data,y));
    }
}
