/*
	Write a program AboveAverage.java that takes integers from command-line, and prints the fraction of values that are strictly above the average value. 
	(Interesting fact: 90% of incoming college students rate themselves as above average).
*/

public class AboveAverage
{
    public static void main(String[] args)
    {
        int[] a = new int[args.length]; // Declaring array a to be of the length equal to the number of command-line arguments provided by the user 
        int sum = 0;
        double avg;
        int n = 0;
	int length = (args.length);

        for (int i = 0; i < length ; i++)
        {
            a[i] = Integer.parseInt(args[i]); // To store command line inputs in array
            sum += a[i]; // Adding all the values provided by the user and storing in the variable 'sum'
        }
        avg = sum/(length); 

        for (int j = 0; j < (length); j++)
        {
            if (a[j] > avg) n++; // if the element at jth index of the array 'a' is greater than the average then increment n
        }

        System.out.print(((double)n/(length))); // Divide n by the total number of arguments and display the result in decimals


    }
}
