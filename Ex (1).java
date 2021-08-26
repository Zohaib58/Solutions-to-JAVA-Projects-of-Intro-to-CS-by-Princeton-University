/*
	Write a program Ex.java that takes a command-line argument N and prints a (2N + 1)-by-(2N + 1) ex like the one below.
	Use two for loops and one if-else statement.

	* . . . . . *
	. * . . . * .
	. . * . * . .
	. . . * . . .
	. . * . * . .
	. * . . . * .
	* . . . . . *
*/
public class Ex
{
   public static void main(String[] args) 
   {
     int num = Integer.parseInt(args[0]); // User-input
     /*
	If we closely observe the pattern, the star appears twice on a single horizontal line - at the position of row number from right-view and left-view.
	
	If we break it down into rows and columns, then we observe that in a row - star is printed at the column number which is equal to the current row number from
	both - right & left.

	Since, we want a pattern of 2N+1, the easy way to generate this is to run a loop from the negative value of an integer to its positive value. Thus,
	the following code pursues this problem in such a way that it runs the loop from -num to positive num, i.e., if the user inputs 2, loop would run from
	-2 to 2 (5 times).

	At the time of printing the first row, 'a' would be minus 2. 'b' would run from -2 to 2. At the first line we want to print star at both the edges. This means
	we want to print the stars at the first and the last column. Since, column is controlled by 'b', we want to print star when b = 2 or b = -2. Thus,
	by printing stars at a = -b or a = b, we can achieve the desired result as a = -2 (a = -2 so a = b means -2 = -2 & a = -b means -2 = -(2)).  
	Similar approach would ensure the printing of this pattern for other values of a too.
     */

     for (int a =-num; a <= num; a++) // to control rows
     {
         for (int b = -num; b <= num; b++) // to control columns
         {
         if (a  == -b || a == b) System.out.print("* ");
         else System.out.print(". ");
         }
         System.out.println(); // Leaving a line after printing all the columns in a row 

     } 
   


   }


}