/*
	Write a function named average() that accepts an array of int as a parameter and returns the average of numbers in the array as a real number. 
	For example, if a variable named nums refers to an array of the elements {6, 2, 9, 11, 3}, then the call of average(nums) should return 6.2. 
	If the array contains no elements, return 0.0.
*/

public class Average
{
    public static double average(int[] nums)
    {
	/*
	 The following function takes an array as a parameter and traverses it. It adds every value of the array to the variable sum
	 & divides it by the total number of values provided in the array, storing the answer in the variable 'result'. Function then returns
	 the variables result.	 
	*/
        int sum = 0;
        double result = 0.0;
        int length = nums.length;
        for (int a = 0; a < length; a++)
        {
           sum += nums[a];
        }
        result = sum/length;
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums = new int[args.length];
        int length = args.length;
        for (int a = 0; a < length; a++)
        {
            nums[a] = Integer.parseInt(args[a]); // Storing command line inputs in the array nums
        }
        System.out.println("The average of these values is " + average(nums));
    }
}
