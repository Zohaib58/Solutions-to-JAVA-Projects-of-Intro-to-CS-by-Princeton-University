/*
	Square Wave. Write a java function to evaluate f(t)=(4/pi)*[sin(1*2*pi*t)/1 + sin(3*2*pi*t)/3 + sin(5*2*pi*t)/5 + ... ]. 
	Your function take two arguments, the value t and number of terms to be computed in the definition of f(t). 
	E.g, evaluate(0.5, 2) will return (4/pi)*[sin(1*2*pi*0.5)/1 + sin(3*2*pi*0.5)/3].
*/

public class Square
{
    public static double average(double t, int n)
    {
        double sum = 0.0;
        double result = 0.0;
        int x = 1;

        for (int i = 1; i <= n; i++)
        {
            // (4/pi)*[sin(1*2*pi*t)/1 + sin(3*2*pi*t)/3 + sin(5*2*pi*t)/5 + ... ]

            sum += (Math.sin(x*2*Math.PI*t)/x);
            x += 2;

        }
        result = (double) 4/Math.PI * sum;
        return result;
    }
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(average(t,n));
    }


}
