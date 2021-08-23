/*
	Write a program Harmonic.java that takes input an integer n from command line and output the nth harmonic number Hn= 1 + 1/2 + 1/3 + ... + 1/n.
*/

public class Harmonic
{
  public static void main(String[] args)
  {
     // Taking Nth number as input
     int n = Integer.parseInt(args[0]);
     
     // Assigning values of 1 and 0.0 to variable 'a' and 'h' respectively
     int a = 1;
     double result = 0.0;
     
     // Until a is less or equal to the input value we would keep adding the reciprocal of a to the variable 'result'
     while (a <= n)
     {
     result = result + 1.0/a;
     a += 1;      
     }

     // Displaying value of the variable 'result'
     System.out.println(result);

  }

}