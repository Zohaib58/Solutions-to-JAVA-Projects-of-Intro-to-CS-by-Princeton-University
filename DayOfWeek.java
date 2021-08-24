/*
	Write a program DayOfWeek.java that takes a date as input and prints the day of the week that date falls on. 
	Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. 
	Use the following formulas, for the Gregorian calendar (where / denotes integer division):

	y0 = y - (14 - m) / 12
	x = y0 + y0 / 4 - y0 / 100 + y0 / 400
	m0 = m + 12 ((14 - m) / 12) - 2
	d0 = (d + x + 31m0 / 12) mod 7

	The value d0=0 for Sunday, d0=1 for Monday, 2 for Tuesday, and so forth. For example, on which day of the week did February 14, 2000 fall?

	y0 = 2000 - 1 = 1999
	x = 1999 + 1999/4 - 1999/100 + 1999/400 = 2483
	m0 = 2 + 12*1 - 2 = 12
	d0 = (13 + 2483 + (31*12) / 12) mod 7 = 2528 mod 7 = 1 (Monday)
*/

public class DayOfWeek
{
  public static void main(String[] args)
  {
     // Taking month, day and year as an input
     int m = Integer.parseInt(args[0]);
     int d = Integer.parseInt(args[1]);         
     int y = Integer.parseInt(args[2]);
     String day = "";
   
     // Calculation  
     int y0 = y - (14 - m) / 12;
     int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
     int m0 = m + 12 * ((14 - m) / 12) - 2;
     int d1 = (d + x + (31 * m0) / 12);
     int d0 = d1 % 7;  
  
     // Checking day of the week 
     if (d0 == 1) day = "Monday";
     else if (d0 == 2) day = "Tuesday";
     else if (d0 == 3) day = "Wednesday";
     else if (d0 == 4) day = "Thursday";
     else if (d0 == 5) day = "Friday";
     else if (d0 == 6) day = "Saturday";
     else if (d0 == 7) day = "Sunday";
  	
     // Displaying	
     System.out.println(day);
  }
}     


    