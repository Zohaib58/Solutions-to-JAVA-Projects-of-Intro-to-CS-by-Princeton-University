/*
	Write a static method arrayEq() that takes two int arrays as arguments and returns true if the arrays have the same length and all corresponding pairs of elements are equal, and false otherwise.
*/

public class ArrayEq
{
    public static void main(String[] args)
    {
	// Providing the length of two arrays as command-line input 
        int nums1length = Integer.parseInt(args[0]);
        int nums2length = Integer.parseInt(args[1]);

        int[] nums1 = new int[nums1length];
        int[] nums2 = new int[nums2length];
	
	// Prompting and storing the inputs provided by the user using STD Library 
        StdOut.print("Type in your Integers for 1st array: ");
        for (int i = 0; i < nums1length; i++)
        {
            nums1[i] = StdIn.readInt();
        }


        StdOut.print("Type in your Integers for 2nd array: ");

        for (int i = 0; i < nums2length; i++)

        {
            nums2[i] = StdIn.readInt();
        }
        System.out.println(arrayeq(nums1, nums2));

    }

    /*

      The following function takes two arrays as a parameter and compares the length of two arrays. If they are unequal, the variable 'status' 
      is set to false. Otherwise, the elements of the two arrays are compared in the loop, (which runs till the end of array) if unequal, 'status'   
      is set to false and the loop breaks.

      The variable status is returned.

    */	

    public static Boolean arrayeq(int[] nums1, int[] nums2)
    {
        boolean status = true;
        if (nums1.length != nums2.length) status = false;
        else
        {
            int x = nums1.length;
            // int y = nums2.length;

            for (int i = 0; i < x; i++)
            {
                if (nums1[i] != nums2[i])
                {
                    status = false;
                    break;
                }
            }
        }
        return status;
    }
}
