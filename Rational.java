/*
	Rational numbers are numbers that can be represented as a fraction p/q where p is an integer number and q is a positive integer (q != 0).

	Design and implement an Abstract Data Type (ADT) Rational for representing such numbers. Implement methods to add and multiply rational numbers. 
	Implement a method for return the value of a rational number as a double value. Make sure that the numerator p and denominator q do not have common divisors in your implementation. 
	Use the algorithm for calculation of the greatest common divisor to ensure this property.

	public class Rational {

	// return p/q as double value
	public double abs()

	// negate a rational number and return as new a Rational object
	public Rational negate()

	// add this and b and return as a new rational number
	public Rational plus(Rational b)

	// compute this += b and return this
	public Rational plusEq(Rational b)

	public Rational multiply(Rational b)
	
	public Rational multiplyEq(Rational b)
	
	// convert this rational number to String
	public String toString()

}
*/


public class Rational
{
    private int p, q;

    public Rational(int P0,int Q0)
    {
        int commonDiv = gcd(P0,Q0);
        p = P0/commonDiv;
        q = Q0/commonDiv;
    }
    public static int gcd(int a,int b)
    {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public double abs()
    {
        return (double)p/q;
    }
    public Rational negate()
    {
        return new Rational((-1*p),q);
    }
    public Rational plus(Rational b)
    {
        return new Rational((p*b.q) + (q*b.p), q*b.q);
    }
    public Rational plusEq(Rational b)
    {
        p = (p*b.q) + (q*b.p);
        q = q*b.q;
        return this;
    }
    public Rational multiply(Rational b)
    {
        return new Rational(p*b.p,q*b.q);
    }

    public Rational multiplyEq(Rational b)
    {
        p = p*b.p;
        q = q*b.q;
        return this;
    }
    public String toString()
    {
        return (p + "/" + q);
    }
    public static void main(String[] args)
    {
        Rational a = new Rational(40,80);
        Rational b = new Rational(3,8);
        System.out.println(a);
        System.out.println(a.abs());
        System.out.println(a.negate());
        System.out.println(a.plus(b));
        System.out.println(a.plusEq(b));
        System.out.println(a.multiply(b));
        System.out.println(a.multiplyEq(b));
    }
}
