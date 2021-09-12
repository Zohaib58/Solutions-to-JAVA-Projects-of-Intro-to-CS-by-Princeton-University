/*
	Write static method to compute greatest common divisor (gcd) of given two integers. We can efficiently compute the gcd using the following property, 
	which holds for positive integers p and q: If p > q, the gcd of p and q is the same as the gcd of q and p % q.

	E.g.
	gcd(1440, 408) = gcd(408, 216) = gcd(216,192) = gcd(192, 24) = gcd(24, 0) = 24
*/

public class GCD
{
    public static int gcd(int one, int two)
    {
        if (two == 0) return one;
        return (gcd(two, one%two));
    }

    public static void main(String[] args)
    {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        int temp = Math.min(one,two);
        one = Math.max(one, two);
        two = temp;


        System.out.println(gcd(one,two));

    }
}
