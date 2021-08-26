/*
	Write a program Triangle.java that takes a command-line argument N and prints an N-by-N triangular pattern like the one below

	. . . . . .
	* . . . . .
	* * . . . .
	* * * . . .
	* * * * . .
	* * * * * .
*/

public class Triangle 
{
    public static void main(String[] args) 
    { 

      /*
	Upon analysing the diagram, it can be observed that horizontally, dot (.) is printed N minus M times,
	WHEREAS,
	Star (*) is printed M times 

	N is the number entered by the user and M is the number of row starting from zero.
      */

      int num = Integer.parseInt(args[0]); // num = N

      // a = M
      for (int a = 0; a < num; a++) // Loop is run 'num' times
      {
	// The following two loops operate the printing of dot (.) and star (.) on a single line
        for (int b = 0; b < a; b++) System.out.print("* ");

        for (int b = 0; b < num-a; b++) System.out.print(". ");

        System.out.println();
      }
    }
}
