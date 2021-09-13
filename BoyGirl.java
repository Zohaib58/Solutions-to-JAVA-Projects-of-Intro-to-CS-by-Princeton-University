/*
	Write a function named boyGirl that accepts a Scanner as a parameter. The Scanner is reading its input from a file containing a series of names followed by integers. 
	The names alternate between boys' names and girls' names. Your method should compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. 
	The input could end with either a boy or girl; you may not assume that it contains an even number of names. If the input file tas.txt contains the following text:

	Steve 3 Sylvia 7 Craig 14 Lisa 13 Brian 4 Charlotte 9 Jordan 6

	then your method could be called in the following way:
	Scanner sc = new Scanner(new File("tas.txt"));
	boyGirl(sc);

	and should produce the following output, since the boys' sum is 27 and the girls' sum is 29:

	4 boys, 3 girls
	Difference between boys' and girls' sums: 2
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class BoyGirl
{
    public static void main (String[]args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("tas.txt"));
        System.out.println(boygirl(sc));
    }
    public static int boygirl(Scanner sc)
    {
        boolean isboy = true;
        int boysum = 0;
        int girlsum = 0;


        while (sc.hasNext()) // Looping until next token (data) is present in sc
        {
            sc.next(); // Moving on to the next token (data) just to sum up the values
	    /*
	      Since boy is always at the first position, 'isboy' was initialised to true and 'if' condition would be true when running for the first time.
	      After collecting data, 'isboy' would be switched to false and when the loop runs for the second time it collects integer for the girl and stores
	      it in the respective variable 'girlsum'. 'isboy' is switched to true. In this manner the integers are added in the respective variables until 
	      the string is present.
	    */
            if (isboy)
            {
                boysum += sc.nextInt();
                isboy = false;
            }
            else
            {
                girlsum += sc.nextInt();
                isboy = true;
            }
        }
        return(Math.abs(boysum - girlsum));
    }
}