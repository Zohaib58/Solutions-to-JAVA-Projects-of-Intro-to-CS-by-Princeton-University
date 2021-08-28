/*
	Birthday problem. Suppose that people enter an empty room until a pair of people share a birthday. 
	On average, how many people will have to enter before there is a match? 
	Write a program Birthday.java to simulate one experiment. Write a program Birthdays.java to repeat the experiment many times and estimate the average value. 
	Assume birthdays to be uniform random integers between 0 and 364.
*/

public class Birthdays
{
    public static void main(String[] args)
    {
        boolean status = false;
        int n = 0;
        int sum = 0;
        int avg = 0;
        boolean[] p = new boolean[365]; // Length is 365, index would be 0 to 364


	/*
	 The following program does an experiment ELEVEN times for calculating the average number of people entering in a room
	 until someone enters sharing a same birthday with someone already present in the room 
	*/

        for (int count = 0; count <= 10; count++)
        {
	 status = false;
         n = 0;
		
	    /*
	     
             The default value of 365 indexes of array 'p' is false
	     A random number from 0 (inclusive) to 1 (exclusive) is generated and stored in 'a' which is multiplied to 365 and its 
	     integer part is stored in 'b'.

	     If the array 'p' at this particular index is false, i.e, birthday doesn't match then turn its value into 'true' else
	     make boolean variable 'status' true which would then stop the while loop.

	     The variable n was incremented throughout the loop 	     

	    */
	
            while (status == false)
            {
                double a =  (Math.random());
                int b = (int) (a * 365);
                n++;
                if (p[b] == false) p[b] = true;
                else status = true;       
            }
          sum = sum + n; // This would add the value of 'n' for ELEVEN experiments
        }
        avg = sum/11; // Calculating average
        
        System.out.println(avg); // Displaying average
    }
}
