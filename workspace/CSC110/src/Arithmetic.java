/*Comment
 This is a interactive java program that uses's Java's arithmetic operators as well as the Scanner object 
 to obtain input from the user. This program will perform the following operations. 
 the opposite of n is opp
   n doubled is twice
   one-half of n is half
   n squared is squared
   the reciprocal of n is recip
   one-tenth of n is tenth and tenth squared is tenthsq
   n minus the last digit of n is y
   the sum of n and n+1 and n+2 is y
   This program showcases understanding of Arithmetic Operators, While Loops, and Try-        Catch error handling.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) { //trying to get exception handling for arthimetic.
		Scanner scan = new Scanner(System.in);
		while(true)//loop infinitely until a correct input
		{	
			try 
			{	
				System.out.print("Enter an integer: ");
				double n = scan.nextDouble();
				double half, squared, recip, tenth, tenthsq, sum,opp, twice, minus;
				opp = -n;
				twice = n *2;
				half = n/2; 
				squared = Math.pow(n, 2);
				recip = 1/n;
				tenth = n *.1;
				tenthsq = Math.pow(tenth, 2);
				sum = n + (n+1) + (n+2);
				
				System.out.println("The opposite of "+n+" is "+ opp);
				System.out.println(n+ "dobuled is "+twice);
				System.out.println("one-half of "+n+" is "+ half);
				System.out.println("The reciprocal of "+n+" is "+recip);
				System.out.println("one-tenth of "+n+ " is "+tenth+" and "+ tenth+ " squared is "+ tenthsq);
				System.out.println("The sum of "+n+ " and "+ (n+1) +" and "+(n+2) +" is "+ sum);
				break;//if no exception the loop breaks
			}
			catch ( InputMismatchException e)
			{
				System.out.println("Please input a number");
				scan.next();//clears the scanner of the wrong input
				continue;//continue to loop if exception is found
			}
		}	
	}

}