/*
	Write a program Hellos.java that takes the number of lines to print as a command-line argument. 
	You may assume that the argument is less than 1000. 
	Hint: consider using i % 10 and i % 100 to determine whether to use "st", "nd", "rd", or "th" for printing the ith Hello.

	E.g.:
	% java Hellos 4
	1st Hello
	2nd Hello
	3rd Hello
	4th Hello
/*

public class Hellos
{
  public static void main(String[] args)
  {

    /*
	st = 1st, 21st, 31st, 41st, 51st, 61st, 71st, 81st, 91st, 101st, 121st ....
             st is added whenever there is 1.
             However, in the case when there is 11 or 111, for instance, there won't be st.
             So, for st to be there mod 10 should be 1 AND mod 100 should not be equal to 11.
             11/100 or 111/100 = 11. This nullifies the 2nd condition and won't print st whenever there is 11th in the Tens.

	Similar cases for nd and rd with 12, 112 and 13, 113 respectively. 
	
	In any other case, th should be displayed as a subscript

    */
    
    // Taking number of lines as input from commandline and storing it in variable 'lines'
    int lines = Integer.parseInt(args[0]);

    // Declaring variable v as a string in which we will store 'st', 'nd', 'rd' & th
    String v = "";
    // Declaring variable a as an integer
    int a = 1;
    
    // Running a while loop until variable 'a' is less than or equal to the number input by the user 
    while (a <= lines)
    {
     if (a % 10 == 1 && a % 100 != 11)  // If remainder of a/10 equals 1 AND remainder of a/100 does not equal to 11 then store string 'st' in variable 'v'
     {
      v = "st";
     }
     else if (a % 10 == 2 && a % 100 != 12)  // If remainder of a/10 equals 2 AND remainder of a/100 does not equal to 12 then store string 'nd' in variable 'v'
     {
      v = "nd";
     }
     else if (a % 10 == 3 && a % 100 != 13)  // If remainder of a/10 equals 3 AND remainder of a/100 does not equal to 13 then store string 'rd' in variable 'v'
     {
      v = "rd";
     }
     else // In any other case, th should be displayed as a subscript
     {
      v = "th";
     }
  
     // Concatenating and displaying output
     System.out.println(a + v + " Hello");
     a++; // a = a + 1
    }

  }

}


