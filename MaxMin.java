/*
	Write a program MaxMin.java that reads in integers (as many as the user enters) from standard-input and prints out the maximum and minimum values.

	Note: The smallest and largest int in java are available as Integer.MIN_VALUE and Integer.MAX_VALUE respectively.
*/

public class MaxMin
{
    public static void main(String[] args)
    {
        StdOut.print("Type in integers: "); // Using Std library to prompt user for the input

        // Using const to store greatest value in min and least value in max
	int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE;

	/*

	 Loop until the input stream is not empty and store the input in x. 
	 If x > max, and the first input would obviously satisfy the condition as currently max has the least value (in low negatives).
	 If x < min, and the first input would also satisfy this condition as currently min has the highest value (in high positives).
	 Thus, initially both max and min would store x. However, as the program would keep receiving inputs it would sort the values accordingly

	*/

        while(!StdIn.isEmpty())
        {
            int x = StdIn.readInt();
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println(max); // Displaying max value
        System.out.println(min); // Displaying min value
    }
}
