/*
	Write a program FivePerLine.java that, using one for loop and one if statement, prints the integers from 1000 to 2000 with five integers per line. 
	Only last line may have less than 5 numbers.

	Hint: use the % operator.
*/

public class FivePerLine
{
  public static void main(String[] args)
    {
     // Running a for loop with the value of counter being stored  in 'a'
     // 'a' has an initial value of 1000 and is incremented by 1 until it is less or equal to 2000
     for (int a = 1000; a <= 2000; a++)
     { 
       if (a % 5 == 0 && a % 10000 != 1000) // When remainder of the value of a/5 = 0 AND the raminder of the value of a/10,000 does not equal 1000, 
                                            // shift to a new line
       {
        System.out.println(" ");
       }
       System.out.print(a + " "); // Displaying the value of 'a' and a space after that 
      }
    }
}