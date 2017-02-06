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
 */
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = scan.nextInt();
		int opp, twice, minus;
		double half, squared, recip, tenth, tenthsq, sum;
		
		opp = -n;
		twice = n *2;
		half = n/2; 
		squared = Math.pow(n, 2);
		recip = 1/n;
		tenth = n *(1/10);
		tenthsq = Math.pow(tenth, 2);
		//testing 
	}

}