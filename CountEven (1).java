/*
	Write a program CountEven.java that create array of int from command line and print the count of even integers in the array. 
	Hint: Create an int array of same size as args.length and copy the integers given as String from args array.
*/

public class CountEven
{
    public static void main(String[] args) 
    {  
       // Declaring an array 'a' which has integer data type
       // The length of array 'a' is equal to the number of inputs given at command line
       int[] a = new int[args.length];
       int count = 0;
       
       for (int i = 0; i < a.length; i++) // Looping till the end of the arguments provided
       {
       	a [i] = Integer.parseInt(args[i]);  // To convert str command line inputs into int and store them in respective array index
       	if (a[i] % 2 == 0) count++; // if the value of ith index of array 'a' has ZERO remainder when divided by two, then increment the 'count' variable
       }
       System.out.println(count); // Display the value of the variable 'count'
    }
}