/*
	Write a recursive method sumTo that accepts an integer parameter n and returns the sum of the first n reciprocals. 
	In other words: sumTo(n) returns: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
	Assume that your method is always passed a value greater than equal to 0.
*/

public class SumTo
{
    public static double sumto(double n)
    {
        if (n == 0) return 0; // base-case
	// Stacks would keep opening & would be executed on the LIFO strategy as shown in the comments below
        return sumto(n-1) + 1/n;    // 0 + 1/1 = 1   // sumto of 4
				    // 1 + 1/2 = 1.5   
                          	    // 1.5 + 1/3 = 1.8333
                                    // 1.8333 + 1/4 = 2.0833


    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(sumto((double)n));
    }
}
