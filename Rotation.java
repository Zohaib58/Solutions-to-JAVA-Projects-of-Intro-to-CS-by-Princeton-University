/*
	Write a program Rotation.java that takes two command-line arguments (the name of an image file and a real number r and rotates the image r degrees counterclockwise. 
	To rotate, set the color of each pixel (ti,tj) in the target image from a source pixel (si,sj) whose coordinates are given by the following formulas:

	..... SEE Q36 ON THIS LINK TO SEE THE IMAGES: https://introcs.cs.princeton.edu/java/31datatype/ ...... 
	si = (ti - ci) cos r - (tj - cj) sin r + ci

	sj = (ti - ci) sin r + (tj - cj) cos r + cj

	where (ci, cj) is the center of the image.

	Note: Math.sin and other trigonometric function assumes angle in radians. To convert angle in degrees to angle in radians, use Math.toRadians method.
*/

public class Rotation
{
    public static void main(String[] args)
    {
	/*
	 NOTE: Created a second object of class Picture in the following code to store the swirled pixels, otherwise, it would ruin the calculations for other pixels
	*/

        Picture pic = new Picture(args[0]);
        pic.show();
        Picture pic2 = new Picture(pic.width(), pic.height()); // Creating a new variable pic2 of class 'Picture' which would be used to display the rotated picture
        double r = Integer.parseInt(args[1]);
        r =  Math.toRadians(r);
        double ci = 0.5 * (pic.width());
        double cj = 0.5 * (pic.height());

	// Two loops to control row and column respetively
        for (int row = 0; row < pic.height(); row++)
        {
            for (int col = 0; col < pic.width(); col++)
            {
		// Calculations
                double si = ((col  - ci) * Math.cos(r)  - (row - cj) * Math.sin(r) + ci);

                double sj =  ((col - ci) * Math.sin(r)  + (row - cj) * Math.cos(r) + cj);

                if (si >= 0 && si<pic2.width() && sj >=0 && sj<pic.height()) // If the calculated pixels are not out of the screen then set them in pic2
                pic2.set(col, row, pic.get((int)si, (int)sj));
            }
        }
        pic2.show();
    }
}
