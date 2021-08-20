/*
	Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
*/

public class Distance
{
  public static void main(String[] args)
  {

     /*
	Formula for finding distance = Square root of (change in x-coordinates^2 + change in y-coordinates^2).
	Since, the distance required here needs to be calculated from the origin we would have to subtract 0 from x and y-coordinate which is equal to x and y only,
        respectively.
     */

     // Taking two integers as input
     int x = Integer.parseInt(args[0]);
     int y = Integer.parseInt(args[1]);
     
     // Calculating square and adding the result in variable 'sq'
     double sq  = (x*x) + (y*y);
     
     // Finding the square root of the variable 'sq' 
     double ans = Math.sqrt(sq);

     // Displaying result
     System.out.println(ans);
  }
}