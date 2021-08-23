/*
	Checksums. The International Standard Book Number (ISBN) is a 10 digit code that uniquely specifies a book. 
	The rightmost digit is a checksum digit which can be uniquely determined from the other 9 digits from the condition that d1 + 2d2 + 3d3 + ... + 10d10 must be a multiple of 11 (here di denotes the ith digit from the right). 
	The checksum digit d1 can be any value from 0 to 10: the ISBN convention is to use the value X to denote 10. Example: the checksum digit corresponding to d10d9d8d7d6d5d4d3d2 = 020131452 is 5 since is the only value of d1 
	between 0 and and 10 for which d1 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 is a multiple of 11.

	Write a program ISBN.java that takes a 9-digit integer as a command-line argument, computes the checksum, and prints the 10-digit ISBN number. It's OK if you don't print any leading 0s.

	Hint: if an int variable x contains a 9 digit integer, then you can access its individual digits as follows:

	int d2 = x % 10;
	int d3 = (x % 100) / 10;
	int d4 = (x % 1000) / 100; and so on.
*/

public class ISBN
{  
   public static void main(String[] args)
   {
     // right most digit is checksum digit
     // 10th dig is checksum
     // Can be calculated from first 9 dig
     // 60d % 11 = 0
     

     int x = Integer.parseInt(args[0]);

     int d2 = x % 10;
     int d3 = (x % 100) / 10;
     int d4 = (x % 1000) / 100;
     int d5 = (x % 10000) / 1000;
     int d6 = (x % 100000) / 10000;
     int d7 = (x % 1000000) / 100000;
     int d8 = (x % 10000000) / 1000000;
     int d9 = (x % 100000000) / 10000000;
     int d10 = (x % 1000000000) / 100000000;

     int b = ((2 * d2) + (3 * d3) + (4 * d4) + (5 * d5) + (6 * d6) + (7 * d7) + (8 * d8) + (9 * d9) + (10 * d10)) % 11;
     int d1 = 11 - b;
     System.out.println(d1);

 
   }
}   