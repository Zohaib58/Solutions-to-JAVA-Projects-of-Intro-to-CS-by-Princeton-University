/*
	Write a program Checkerboard.java that takes a command-line argument n and plots an n-by-n checkerboard with red and black squares. Color the lower-left square red.
		
	.... TO GET THE IMAGE FOR THIS QUESTION -> https://introcs.cs.princeton.edu/java/15inout/ ....

	Notes:

	It would be helpful to set the x-axis and y-axis scale with StdDraw.setXscale(0,N) and StdDraw.setYscale(0,N).
	Color can be set as follows: StdDraw.setPenColor(StdDraw.BLACK) or StdDraw.setPenColor(StdDraw.RED)
	Use StdDraw.filledSquare(x,y,r) to draw filled square of radius r centered at point (x,y).
*/

public class CheckBoard
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);
        for (int i = 0; i < N; i++) // for row pixels
        {
            for (int j = 0; j < N; j++) // for column pixels
            {
		/*
		 Library starts filling the screen from bottom-left. Viewing from the left, we observe the pattern that red box appears when the division of the addition 
		 of row and column number by 2 results in 0. For all other cases, black box should appear. Thus, that is implemented in the code below. 
		/*
                if ((i + j) % 2 == 0) StdDraw.setPenColor(StdDraw.RED); 
                else StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledSquare(i + 0.5 , j + 0.5, 0.5);
                
            }
        }

    }
}