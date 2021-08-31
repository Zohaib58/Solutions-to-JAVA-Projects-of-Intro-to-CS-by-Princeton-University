/*
	Write a function that takes three real arguments, x, y, and s, and plots an equilateral triangle centered on (x, y) with side length s. 
	Call the function a number of times in main to produce an entertaining pattern.
	Hint: Vertices of such equilateral triangles are
	A = ( x, y + sqrt(3)/2 * s )
	B = ( x - s/2, y - sqrt(3)/6 * s )
	C = ( x + s/2, y - sqrt(3)/6 * s )
*/

public class EquilateralTriangle
{
    public static void equi(double x, double y,double s)
    {// We will be drawing from centre
        double topy = (y + Math.sqrt(3)/2 * s);
        double bottomy = (y - Math.sqrt(3)/6 * s);
        StdDraw.line(x-s/2, bottomy, x+s/2, bottomy);
        StdDraw.line(x-s/2, bottomy, x, topy);
        StdDraw.line(x+s/2, bottomy, x, topy);

    }
    public static void main(String[] args)
    {
        StdDraw.setXscale(0, 1000);
        StdDraw.setYscale(0, 1000);

        for (int a = 0; a < 1000; a += 100)
        {
            equi(a + Double.parseDouble(args[0]), a + Double.parseDouble(args[1]), a + Double.parseDouble(args[2]));
        }

    }

}
