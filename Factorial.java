/*
	Factorial Write a program Factorial.java that takes one integer command line input n and prints out n!. To compute the factorial, 
	write a function that has the following signature:
	public static long factorial(int n)
	What is the largest value of n that your function can handle without overflow?
*/

public class Factorial
{
    public static long factorial(int n)
    {
	/*
	
	 To calculate the factorial you have to multiply the number with (number - 1) * (number - 2) * ... until the multiplier is 1.
	 For example, 5! or factorial of 5 is calculated by  5 * (5-1 = 4) * (5 - 2 = 3) * (5 - 3 = 2) * (5 - 4 = 1) = 120.
	 Since, we need to stop when the multiplier is 1, we achieve this through a while loop and a variable 'a' (which stores the value n-1 initially,
	 where n is the input value provided by the user), where 'a' is decremented to achieve the result.
	
	 The variable result, initially, stores the number provided by the user and then it is being multiplied with 'a' and storing the result in itself.
	
	 The variable 'result' is returned outside the loop
	 
	*/

        int a = n-1;
        int result = n;
        while (a > 1)
        {

            result = result * a;
            a--;

        }
        return result;
    }
    public static void main(String[] args)
    {

        int n = Integer.parseInt(args[0]);
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}
