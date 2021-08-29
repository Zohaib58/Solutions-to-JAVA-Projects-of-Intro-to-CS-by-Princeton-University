/*
	Write a program LongestRun.java that reads in a sequence of integers from standard input and prints out both the integer that appears in a longest consecutive run and the length of the run. 
	For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should print Longest run: 4 consecutive 7s.
*/

public class LongestRun
{
    public static void main(String[] args)
    {
        StdOut.print("Type in integers: "); // Using Std library to prompt user for the input

        int previous = 0;
        int count = 0;
        int longest_count = 0;
        int num = 0;

        while (!StdIn.isEmpty()) // Loop would run until the input stream is empty
        {
            int user_input = StdIn.readInt(); // Storing user's input

	    /*

	      There is a variable, 'previous', which is used to store the previous input so if the 'user_input' is not equal
	      to the value stored in 'previous' then the value of the variable previous is updated and 'count' is initialised
	      to zero.

	      Count is incremented.

	      There's a variable 'longest_count' which keeps track of the longest run number provided as an input.
	      If the 'count' exceeds 'longest_count' then the 'count' is stored in the longest count and that particular 
              input value is stored in the variable num
	      
	    */

            if (user_input != previous)
            {
                previous = user_input;
                count = 0;
            }
            count++;
            if (count > longest_count)
            {
                longest_count = count;
                num = user_input;
            }
        }
        System.out.print(num + " is consecutive "); // Number displayed
        System.out.print(longest_count + " times"); // Number of times that number occured is displayed

    }

}

