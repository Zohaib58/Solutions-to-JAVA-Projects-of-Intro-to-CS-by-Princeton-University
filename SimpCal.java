/*
	Write a program that take two integers from command line and prints sum of two number and result of subtracting first from the second. 
	Note: Use Integer.parseInt(args[0]) to convert args[0] from String to int.

	Example 1:
	% java YourProg 20 10
	Output:
	30
	-10

	Example 2:	
	% java YourProg 5 10
	Output:
	15
	5
/*

public class SimpCal
{  
   public static void main(String[] args)
 {   
     // Taking command-line input from the user, converting it into int and storing it in int variables
     int num1 = Integer.parseInt(args[0]); 
     int num2 = Integer.parseInt(args[1]);

     // Storing the result of subtraction and addition 
     int add = num1 + num2;
     int sub = num1 - num2;

     // Displaying the result 
     System.out.println(add);
     System.out.println(sub);
 }

}