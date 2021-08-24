/*
	Write a program Hurricane.java that that takes the wind speed (in miles per hour) as an integer command-line argument and prints whether it qualifies as a hurricane, 
	and if so, whether it is a Category 1, 2, 3, 4, or 5 hurricane. Below is a table of the wind speeds according to the Saffir-Simpson scale.

	Category	Wind Speed (mph)
	1		74 - 95
	2		96 - 110
	3		111 - 130
	4		131 - 155
	5		156 and above
*/

public class Hurricane
{
  public static void main(String args[])
  { 
    // Taking the value of windspeed as an input from command line
    int ws = Integer.parseInt(args[0]); 
    int cat = 0; // Initialising 0 to the variable 'cat' that represents category of hurricane
    
    if (ws >= 156) cat = 5; // If the value of windspeed is greater than 156 than it is a 5 category hurricane
    else if (ws >= 131) cat = 4; // If the value of windspeed is greater than 131 but less than 156 than it is a 4 category hurricane
    else if (ws >= 111) cat = 3; // If the value of windspeed is greater than 111 but less than 131 than it is a 3 category hurricane
    else if (ws >= 96) cat = 2; // If the value of windspeed is greater than 96 but less than 111 than it is a 2 category hurricane
    else if (ws >= 74) cat = 1; // If the value of windspeed is greater than 74 but less than 96 than it is a 1 category hurricane
    else System.out.println("It is not a hurricane"); 
     
    System.out.println("It is a hurricane of category " + cat);      
  }
}