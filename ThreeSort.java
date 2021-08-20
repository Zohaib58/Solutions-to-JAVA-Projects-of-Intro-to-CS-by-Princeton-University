/*
   Write a program ThreeSort.java that takes three int values from the command line and prints them in ascending order. Use Math.min() and Math.max().
*/

public class ThreeSort
{
  public static void main(String[] args)
  {
     // Taking three integer numbers as input from commandline and storing them in respective variables
     int num1 = Integer.parseInt(args[0]);
     int num2 = Integer.parseInt(args[1]);         
     int num3 = Integer.parseInt(args[2]);
  
     // Calculating the minimum number among the first two numbers
     int mini1 = Math.min(num1, num2);
     // Calculating the least number among the three numbers by comparing the result of first two numbers (stored in var min1) with the third one 
     int min = Math.min(mini1, num3);
     // Calculating the maximum number among the first two numbers
     int max1 = Math.max(num1, num2);
     // Calculating the greatest number among the three numbers by comparing the result of first two numbers (stored in var max1) with the third one
     int max = Math.max(max1, num3);
 
     // Finding the middle number
     int sum = num1 + num2 + num3; // for e.g. 2 + 3 + 4 = 9
     int mid = (sum - min) - max;  // (9 - 2) - 4 = 3
  
     // Displaying min, middle and max number
     System.out.println(min);
     System.out.println(mid);
     System.out.println(max);
  } 
}