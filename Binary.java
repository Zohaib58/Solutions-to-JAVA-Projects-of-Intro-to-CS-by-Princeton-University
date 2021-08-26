/*
	Write a program Binary.java that prints the binary representation of an integer n. You can use the following method: 
	Write 1 if n is odd, 0 if n is even. Divide n by 2, throwing away the remainder.
	Repeat until n = 0 and read the answer backwards.
	Use % to determine whether n is even, and use string concatenation to form the answer in reverse order.
*/

public class Binary
{
  public static void main(String args[])
  { 

    /*
	The program takes an integer from commandline (user-input) and stores it in the variable num.
	The variable digits is initialised as a String which would store the binary from of Integer.
	A loop is run until the integer stored in variable 'num' is greater than Zero.
	The remainder when the integer is divided by 2 is stored in a variable 'rem'.
	The remainder, 0 or 1 is stored in reverse order in the variable "digits".
	
	Consequently, dividing the value stored in 'num' would eventually make it less than zero and this would break the loop.

	The binary form of the integer, stored in the variable 'digits' is displayed.
    */
    int num = Integer.parseInt(args[0]);
    String digits = ""; 
    while (num > 0)
    {
     int rem = num % 2;
    
     if (rem == 0) digits =  0 + digits;
     else digits = 1 + digits;
     num = num / 2;          
    }
    System.out.print(digits); 
  }
}