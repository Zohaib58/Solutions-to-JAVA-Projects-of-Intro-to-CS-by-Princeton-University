/*
	(Use switch statement. For reference, see https://introcs.cs.princeton.edu/java/13flow/NameOfDay.java.html )

	Write a program named daysInMonth.java that accepts a month (an integer between 1 and 12) as a parameter 
	and prints the number of days in that month in this year. 
	For example, the call % java daysInMonth 9 would print 30 because September has 30 days.
	Assume that the code is not being run during a leap year (that February always has 28 days).

	Month	1 Jan	2 Feb	3 Mar	4 Apr	5 May	6 Jun	7 Jul	8 Aug	9 Sep	10 Oct	11 Nov	12 Dec
	Days	31	28	31	30	31	30	31	31	30	31	30	31
*/

public class daysInMonth
{
   public static void main(String[] args) 
   {
     int month = Integer.parseInt(args[0]);
     switch (month)
     {
        case 1:
              System.out.println("31");
              break;

        case 2:
              System.out.println("28");
              break;

        case 3:
              System.out.println("31");
              break;

        case 4:
              System.out.println("30");
              break;

        case 5:
              System.out.println("31");
              break;

        case 6:
              System.out.println("30");
              break;

        case 7:
              System.out.println("31");
              break;

        case 8:
              System.out.println("31");
              break;

        case 9:
              System.out.println("30");
              break;

        case 10:
              System.out.println("31");
              break;

        case 11:
              System.out.println("30");
              break;

        case 12:
              System.out.println("31");
              break;
     }


   }
}
  