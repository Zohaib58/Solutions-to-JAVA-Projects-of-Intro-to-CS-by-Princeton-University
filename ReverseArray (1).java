/*
	Write a program ReverseArray.java that reverses the order of values in a one-dimensional String array. 
	For instance, the following array String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	would be transformed to {"nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero"}
	Do not create another array to hold the result. Hint: Use the code in the text for exchanging two elements.
*/

public class ReverseArray
{
    public static void main(String[] args) 
    {
      String[] a = new String[args.length];
      String temp;
      int b;
      int m = a.length-1;

      for (int i = 0, n = args.length; i < n; i++)
       {
           a [i] = args[i]; // Storing data in the array from commandline
       }
      int x = args.length % 2 == 1 ? args.length / 2 + 1 : args.length/2;  // Number of inputs divided by 2 = 1? If YES, then store 1 + (number of inputs/2) in 'x'
									   // If NO, then store (number of inputs/2) in 'x' 
      

      /*
	'x' stores half or half+1 the length of the number of arguments provided by the user.
	'm' stores the value of args.length - 1
	
	The loop runs from the ending index of the array to the midway
	'j' starts from 'm' and then decrements until j is less than 'x'
	This is the most efficient approach of this program as the loop reaches the midway
	of the given array, sorting is completed and there is no need to run the loop till the very end of the array

	A dry run would help more in understanding this part of the code:

	String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
	would be transformed to {"nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero"}
	
	a.length = 10, m = 9, x = 5
	j = 9
	b = 0
	temp = a[9] 	which  is "nine" 
	a[9] = a[0] 	which is "zero"
	a[0] = temp 	which is "nine"
	
	Now the first element of the array is "nine" and the last element is "zero". This code would similarly sort the rest of the elements and would stop
	when the value of j gets lesser than 5

      */
      for (int j = m; j >= x; j--) 
      {
       b = m - j; 
       temp = a[j]; 
       a[j] = a[b]; 
       a[b] = temp; 
   
      }
      for (int l = 0; l <= m; l++) 
      System.out.println(a[l]);	// Displaying the sorted array      
    }
}