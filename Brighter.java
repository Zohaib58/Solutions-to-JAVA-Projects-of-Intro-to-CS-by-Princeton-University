/*
	Write a program Brighter.java that takes a command line argument which is the name of a JPG or PNG file, displays it in a window, 
	and display a second version which is a brighter copy. Use the Color method brighter(), which return a brighter version of the invoking color.
*/

import java.awt.*;

public class Brighter
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("download.jpg");
        pic.show();
        Picture pic2 = new Picture(pic.width(), pic.height());
	
	// Two loops to control row and column respetively
        for(int x = 0; x < pic.width(); x++)
        {
            for (int y = 0; y < pic.height(); y++)
            {
		// Getting the pixels and making them brighter then setting them on pic2
                Color a  = pic.get(x,y);
                Color b = a.brighter();
                pic2.set(x,y,b);
            }

            pic2.show(); // Displaying pic2

        }

    }
}
