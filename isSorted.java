/*
	Write a program isSorted.java that given an array of real numbers prints true if the list is in sorted (non-decreasing) order and false otherwise.
	For example, if arrays store {16.1, 12.3, 22.2, 14.4} and {1.5, 4.3, 7.0, 19.5, 25.1, 46.2} respectively, your program should print false and true respectively.
	Assume the array has at least one element. A one-element array is considered to be sorted.
*/

public class isSorted 
{
    public static void main(String[] args) 
    {  
       boolean sorted = true; // A boolean variable 'sorted' initialised as true
       double[] a = new double[args.length];  // Declaring an array 'a' which has double data type
               				      // The length of array 'a' is equal to the number of inputs given at command line
       for (int i = 0; i < (args.length); i++) // Looping till the end of the arguments provided
       {
           a [i] = Integer.parseInt(args[i]);  // To store command line inputs in array
       }

       /*
	The following portion of program traverses array A.
	Loop runs till the second last element because inside the loop, the jth element of an array is compared to j+1th element of the array 'a'
	so loop needs to be stopped at the second last element as it would be compared with the last one. Otherwise, program would run into an 	
	index out of bounds error.

	If at any point, element at jth position would be greater than the element at j+1th position in the array, this would depict that the 
	array is un-sorted, hence, this would store 'false' in the variable 'sorted' and break the loop.

	Value stored in the variable 'sorted' would be printed. 	
       */

       for (int j = 0; j < (a.length - 1); j++)
       {
           if (a[j] < a[j+1]) sorted = true;
           else
           {
           sorted = false;
           break; // exit loop
           }
       }
       System.out.println(sorted);
    }
}