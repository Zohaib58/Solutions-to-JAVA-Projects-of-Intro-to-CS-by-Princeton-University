/*
	Write a function called stripComments that accepts a Scanner representing an input file containing a Java program as its parameter, reads that file, 
	and then prints the file's text with all comments removed. 
	A comment is any text on a line from // to the end of the line, and any text between /* and */ characters. 
	For example, consider the following text:

	import java.util.*;
	/* My program
	by Suzy Student */
	public class Program {
    	public static void main(String[] args) {
        	System.out.println("Hello, world!"); // a println
    	}

    	public static /* Hello there */ void foo() {
        	System.out.println("Goodbye!"); // comment here
    	} /* */
	}
	If the file contained this text, your program should output the following text:

	import java.util.*;

	public class Program {
    	public static void main(String[] args) {
        	System.out.println("Hello, world!");
    	}

    	public static  void foo() {
        	System.out.println("Goodbye!");
    		}
	}
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripComments
{
    public static void main (String [] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("tas.txt"));
        stripcomments(sc);
    }
    public static void stripcomments(Scanner sc)
    {
        String doubleslash = "//";
        String slashstar = "/*";
        String starslash = "*/";
        //String lpr = ""; // data to be printed
        boolean isSlashStar = false;

        while (sc.hasNext())
        {
            //boolean c = false;
            boolean f = false;
            String line = sc.nextLine();
            /* The elseif block below works for the following conditions:
            * slashstar and starslash at end and start respectively, it won't add anything in lpr
            * slashstar and starslash in the middle, would add data that is not between slashstar and starslash
            *  */

            if (line.contains(slashstar) && line.contains(starslash)) // for lines having /* and */
            {
                System.out.println(line.substring(0, line.indexOf(slashstar)) + line.substring(line.indexOf(starslash)+2));
                //c = true;
            }
            else if (line.contains(doubleslash)) // to not include the double slashed part
            {
                //c = true;
                System.out.println(line.substring(0, line.indexOf(doubleslash)));
            }

            /* The else if block below serves two purposes
               1. If a line contains /* it picks the data before that and concats into lpr
               2. turns boolean variable isSlashStar to true so that we can run a loop ahead until we find starslash which would incdicate
                  that this whole part of code was commemnted
             */

            else if (line.contains(slashstar))
            {
                System.out.println(line.substring(0, line.indexOf(slashstar)));
                isSlashStar = true;
                //c = true;
            }
            else if (line.startsWith(slashstar) || isSlashStar) // if it starts with slashstar find the line which contains starslash
            {
                while (!f)
                {
                    //line = sc.nextLine();
                    if (line.contains(starslash)) // if starslash is found, i.e., end of comment
                    {
                        System.out.println(line.substring((line.indexOf(starslash)+2)));
                        isSlashStar = false;
                        f = true;
                    }
                    line = sc.nextLine();
                }
            }
            else System.out.println(line); // Condition for f is not needed after while loop we are fetching new line in the variable line
        }

    }

}


