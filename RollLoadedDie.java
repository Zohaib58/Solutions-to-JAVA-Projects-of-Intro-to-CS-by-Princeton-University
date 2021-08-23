/*
	Write a program RollLoadedDie.java that prints the result of rolling a loaded die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8
	and the probability of getting a 6 is 3/8.
*/

public class RollLoadedDie
{ 
  public static void main ( String [] args)
  {
     // Using Math.random method to generate a decimal value between 0.0 (inclusive) to 1 and storing it in variable 'a'
     double a = Math.random();
     
     // Multiplying the value of a with 8, adding 1 and storing the integer part in variable 'b' (Multiplying with 8 because P(6) = 3, i.e. 6, 7 or 8)
     int b = (int) ((a * 8) + 1); // b would contain any value from 1 to 8 inclusive

     
     // Since the probability of getting 6 is supposed to be 3/8 so whenever b is greater or equal to 6, output would be 6, otherwise respective number would be printed
     if (b >= 6)
     {
      System.out.println("The system rolled the die " + 6);
     }
     else
     {
      System.out.println("The system rolled the die " + b);
     }
  }
}