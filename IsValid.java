/*
	Write a function isValid to check whether a given string is a valid password, i.e, it obeys the following rules:

	A password must have at least ten characters.
	A password consists of only letters and digits.
	A password must contain at least two digits.
	A password must contain at least one letter.
	Hint: We can iterate over all characters in a String s as follows:

	for(int i=0; i<s.length(); i++)

	System.out.print(s.charAt(i) + " ")

	A reference of useful String operations and other functions is provided at the end.
*/

public class IsValid
{
    public static String isValid(String password)
    {
        int count = 0;
        int count2 = 0;
        if (password.length() < 10) return "Invalid. Length of your password should be 10 at least"; // Returning prompt if password contains less than 10 characters
        
	for(int i=0, length = password.length(); i < length; i++)
        {
	    // If the character at ith index of the string password is not a letter or a digit, then a prompt is returned	
            if (!Character.isLetterOrDigit(password.charAt(i))) return "Invalid. Only letters or digits are accepted";
            
	    // Taking note of the number of digits and letters in the string to later verify if they are above than 2 or not
	    if (Character.isDigit(password.charAt(i))) count++;
            if (Character.isLetter(password.charAt(i))) count2++;
        }
        if (count < 2 || count2 < 2) return "Two digits and letters should be there in your password at least";
        
	return "Valid"; // Returning valid if all of the conditions are met

    }
    public static void main(String[] args)
    {
        String password = args[0];
        System.out.println(isValid(password));
    }
}
