/*
	Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice). 
	Use Math.random().	
*/

public class SumOfTwoDice
{
  public static void main(String[] args)
  {
     // Storing the number of sides of a dice in a variable 'dice'
     int dice = 6;
 
     // Generating a random number from 0 (inclusive) to 1 (exclusive) and storing it in a variable 'ran1'
     double ran1 = Math.random();
     // Multiplying 'ran1' by 6 and storing its integer form (2.5 = 2) in the variable 'num1'
     int num1 = (int) (ran1 * 6);
     // Generating a second random number from 0 (inclusive) to 1 (exclusive) and storing it in a variable 'ran2'
     double ran2 = Math.random();
     // Multiplying 'ran2' by 6 and storing its integer form (2.5 = 2) in the variable 'num2'
     int num2 = (int) (ran2 * 6);
     
     // Adding num1 and num2 to store the addition in the variable 'result' and displaying it
     int result = num1 + num2;
     System.out.println(result); 
  }
}