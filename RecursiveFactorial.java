/*
	Write a recursive function that takes in one argument n and computes n!, the factorial function. Recall that n! = n*(n-1)! when n>0 and 0!=1.
*/

public class RecursiveFactorial
{
    public static int factorial(int n)
    {
	/*
	 To calculate the factorial you have to multiply the number with (number - 1) * (number - 2) * ... until the multiplier is 1.
	 For example, 5! or factorial of 5 is calculated by  5 * (5-1 = 4) * (5 - 2 = 3) * (5 - 3 = 2) * (5 - 4 = 1) = 120.
	 Since, we need to stop when the multiplier is 1 & also we need the output 1 when the input is 0, we achieve this by applying
	 the base case of returning 1 when n (parameter) is 0.

	 For example, if n is 4 the first stack would contain factorial(4).
	 Then factorial(3) due to the call of factorial(n-1). Then factorial(2). Then factorial(1). The last stack would be of factorial(0).

	 In the stack of factorial(0) base case would be true and 1 would be returned to the stack of factorial(1). Now in the stack of 
	 factorial(1), 1 x 1 = 1 would be returned to the stack of factorial(2). Similar operation would be carried out for other stacks.
         Comments after the 'return' statement highlight this effectively 
	*/
        if (n == 0) return 1; // base case
        return factorial(n-1) * n;  // 1 x 1 = 1   // factorial of 4
				    // 1 x 2 = 2   
                          	    // 2 x 3 = 6
                                    // 6 x 4 = 24
    }


    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println(factorial(n));
    }
}