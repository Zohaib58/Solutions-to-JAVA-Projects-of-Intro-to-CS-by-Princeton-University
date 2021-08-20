/*
     Write a program Stats3.java that prints three uniform random values between 0 and 1, their average value, and their minimum and maximum value. 
     Use Math.random(), Math.min(), and Math.max().
*/

public class Stats3
{  
   public static void main(String[] args)
   {
    
      // Generating three random numbers from 0 (inclusive) to 1 (exclusive) and storing them in variables x, y, z
      double x = Math.random();
      double y = Math.random();
      double z = Math.random();
     
      // Calculating the minimum number among the first two numbers
      double mini1 = Math.min(x,y);
      // Calculating the least number among the three numbers by comparing the result of first two numbers (stored in var min1) with the third one 
      double min = Math.min(mini1,z);
      // Calculating the maximum number among the first two numbers
      double maxi1 = Math.max(x,y);
      // Calculating the greatest number among the three numbers by comparing the result of first two numbers (stored in var min1) with the third one 
      double max = Math.max(maxi1,z);

      // Calculating average
      double avg = (max + min) / 2;
 
      // Displaying the three random numbers stored in variable x, y and z, & then the minimum & maximum amongst them, & then the average
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      System.out.println(min);
      System.out.println(max);
      System.out.println(avg);
      
   }
}