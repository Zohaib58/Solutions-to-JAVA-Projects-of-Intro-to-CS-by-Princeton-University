/*
	Creating a swirl effect is similar to rotation, except that the angle r changes as a function of distance to the center of the image.
	Use the same formulas as in the previous exercise, but compute r as a function of (si,sj), specifically Pi/256 times the distance to the center.

	..... SEE Q37 ON THIS LINK TO SEE THE IMAGES: https://introcs.cs.princeton.edu/java/31datatype/ ...... 
*/

public class Swirl
{
    public static void main(String[] args)
    {
	/*
	 NOTE: Created a second object of class Picture in the following code to store the swirled pixels, otherwise, it would ruin the calculations for other pixels
	*/
        Picture pic = new Picture(args[0]);
        pic.show();
        Picture pic2 = new Picture(pic.width(), pic.height()); // Creating a new variable pic2 of class 'Picture' which would be used to display the swirled picture
        double ci = 0.5 * (pic.width());
        double cj = 0.5 * (pic.height());

	// Two loops to control row and column respetively
        for (int row = 0; row < pic.height(); row++)
        {
            for (int col = 0; col < pic.width(); col++)
            {
		// Calculations
                double r =  Math.sqrt(((col - ci)*(col - ci)) + ((row - cj)*(row-cj))) * Math.PI/256;
                double si = ((col  - ci) * Math.cos(r)  - (row - cj) * Math.sin(r) + ci);

                double sj =  ((col - ci) * Math.sin(r)  + (row - cj) * Math.cos(r) + cj);

                if (si >= 0 && si<pic2.width() && sj >=0 && sj<pic.height()) // If the calculated pixels are not out of the screen then set them in pic2
		pic2.set(col, row, pic.get((int)si, (int)sj));
            }
        }
        pic2.show();
    }
}
