/*
	Write a function named percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers in the array as a real number. 
	For example, if a variable named nums refers to an array of the elements {6, 2, 9, 11, 3}, then the call of percentEven(nums) should return 40.0. 
	If the array contains no even elements or no elements at all, return 0.0.
*/

public class Evens
{
    public static double percenteven(int[] nums)
    {
	/*
	The following function traverses the array which it takes as a parameter and compares the remainder of value stored at each index with zero.
	If it equals to zero than the variable count is incremented until the loop runs and then later divided by the number of values provided in the array.
	Percentage is calculated by storing the divided value in the variable 'a' which is multiplied by 100, stored in 'percentage' & returned.
	*/
        int count = 0;
        int array_length = nums.length;
        for (int a = 0; a < array_length; a++)
        {
            if (nums[a] % 2 == 0) count++;

        }
        double a = (double) count / array_length; // Type-Casting count into double would produce a double value, stored in 'a'
        double percentage = a * 100;
        return percentage;
    }
    public static void main(String[] args)
    {
        int[] nums = new int[args.length];
        int length = args.length;
        for (int a = 0; a < length; a++) 
        {
            nums[a] = Integer.parseInt(args[a]); // Storing command line inputs in the array nums
        }
        System.out.println("The percentage of even numbers in the array is " + percenteven(nums));
    }

}
