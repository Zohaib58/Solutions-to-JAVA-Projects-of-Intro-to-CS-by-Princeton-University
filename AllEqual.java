/*
	Write a program AllEqual.java that takes three integer command-line arguments and prints true if all three are equal, and false otherwise.
*/

public class AllEqual
{
  public static void main(String[] args)
  {

     /*
	We can only compare three variable at once using the AND operator (&&). 
        AND:
        True True = True
        True False = False
        False True = False
        False False = False

        So if a = b and b = c which means a also equals c then only status1 would have the value True.
     */
     // Taking three integers as input from Command Line
     int a = Integer.parseInt (args[0]);
     int b = Integer.parseInt (args[1]);
     int c = Integer.parseInt (args[2]);


     boolean status1 = (a==b) && (b==c);
     
     // Printing the result that is stored in variable status1
     System.out.println(status1);
  }
}