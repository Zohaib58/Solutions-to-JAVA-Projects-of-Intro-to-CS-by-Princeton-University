/*
	Write a recursive method writeChars that accepts an integer parameter n and that prints out n characters as follows. 
	The middle character of the output should always be an asterisk ("*"). If you are asked to write out an even number of characters, 
	then there will be two asterisks in the middle ("**"). Before the asterisk(s) you should write out less-than characters ("<"). 
	After the asterisk(s) you should write out greater-than characters (">"). For example, the following calls produce the following output:

	Call		Output
	writeChars(1)	*
	writeChars(2)	**
	writeChars(3)	<*>
	writeChars(4)	<**>
	writeChars(5)	<<*>>
	writeChars(6)	<<**>>
	writeChars(7)	<<<*>>>
	writeChars(8)	<<<**>>>
*/

public class WriteChars
{
    public static String writechars(int n)
    {
	/*

	  For example, n = 4.
	  1st stack (writechars(4)): '<' displayed on screen
	  2nd stack (writechars(2)): '**' returned to the first stack because base case is true
	  1st stack: '**>' returned to main program and printed
	  Since '<' was printed at first, this function enabled us to generate the following pattern:
	  <**>

	*/
        if (n == 1) return "*"; // base-case
        if (n == 2) return "**"; // base-case
        System.out.print("<");
        return(writechars(n - 2) + ">");

    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);

        System.out.println(writechars(n));
    }
}
