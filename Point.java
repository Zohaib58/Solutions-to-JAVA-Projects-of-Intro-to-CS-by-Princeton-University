/*
	Write a data type Point that implements the following API

	...... To check out the API see Q11 in the following link: https://introcs.cs.princeton.edu/java/32class/......

	Following is an example of a test client.

	public static void main(String[] args) {	
        Point p = new Point(1,2);
        Point origin = new Point(0,0);

        System.out.println("Point is:" + p);
	System.out.println("Distance to origin is:" p.distanceTo(origin))
}

Exercise 2:
Add the following method to the Point class:

public int quadrant()

Returns which quadrant of the x/y plane this Point object falls in. Quadrant 1 contains all points whose x and y values are both positive. Quadrant 2 contains all points with negative x but positive y. Quadrant 3 contains all points with negative x and y values. Quadrant 4 contains all points with positive x but negative y. If the point lies directly on the x and/or y axis, return 0.

Exercise 3:
Add the following method to the Point class:

public void flip()

Negates and swaps the x/y coordinates of the Point object. For example, if the object initially represents the point (5, -3), after a call to flip, the object should represent (3, -5). If the object initially represents the point (4, 17), after a call to flip, the object should represent (-17, -4).
*/


public class Point
{
    private double dx, dy; // Instance Variables
    //private String distance;

    public Point(double x, double y) // Constructor
    {
        dx = x;
        dy = y;
    }
    public double DistanceTo(Point q)
    {
        return Math.sqrt(Math.pow(q.dx-dx,2)+Math.pow(q.dy-dy,2));

    }
    public String toString()
    {
        return "Original co-ordinates are (" + dx + "," + dy + ").";
    }
    public int quadrant()
    {
        int quadrant=0;
        if (dx < 0)
        {
            if (dy > 0) quadrant = 4;
            else quadrant = 3;
        }
        else if (dx > 0)
        {
            if (dy < 0) quadrant = 2;
            else quadrant = 1;
        }
        return quadrant;
    }
    public void flip()
    {
        double temp = dx;
        dx = (dy * -1);
        dy = (temp * -1);
    }
    public static void main(String [] args)
    {
        Point a = new Point (1, -2);
        Point origin = new Point( -16,4);
        origin.DistanceTo(a);
        System.out.println(a.quadrant());
        //a.flip();
        System.out.println(a.toString());
    }
}