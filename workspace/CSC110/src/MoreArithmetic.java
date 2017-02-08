/*
 Part 0: YYYYMMDD to YYYY, MM, DD

Prompt the user to enter a date in the YYYYMMDD format. [Example: 3 February 2014 is 20140203]
Read the user input into an int defined variable.

Split the user entered YYYYMMDD number into its respective YYYY, MM, DD pieces using integer division and the modulus operator. [note: 20140203 / 10000 = 2014 and 20140203 % 10000 = 203]

Print a line that has the following format.

   YYYYMMDD: MM/DD/YYYY (U.S.) ... DD/MM/YYYY (most widely used)

   examples...

   20140203: 2/3/2014 (U.S.) ... 3/2/2014 (most widely used)
   19571105: 11/5/1957 (U.S.) ... 5/11/1957 (most widely used)
   20380118: 1/18/2038 (U.S.) ... 18/1/2038 (most widely used)
Part 1: BMI and ABSI Calculator

Calculate BMI (Body Mass Index) and ABSI (A Body Shape Index) values using the following three user supplied integer inputs.

   prompt the user to enter their waist circumference in inches
   prompt the user to enter their weight in pounds
   prompt the user to enter their height in feet and inches
Calculate and print the BMI and ABSI values. Note: Code must be written to convert the user entered height (feet and inches) into inches.

The following are the BMI and ABSI equations.

   BMI =  weight / height^2 * 703
   ABSI = waist_circumference / (BMI^(2.0/3.0) * height^(0.5))
The static pow(double a, double b) method found in class Math can be used to calculate the exponents. The method returns a value of type double that is the first argument raised to the power of the second argument.

   the following code snippet uses Math.pow()...

      double phi = 1.618;
      double y = Math.pow(phi, 1.0/3.0);
      System.out.println("the cube root of the golden ratio is " + y);
      y = Math.pow(phi, 2.0);
      System.out.println("the golden ratio squared is " + y);

   and it prints the following...

      the cube root of the golden ratio is 1.1739767763255111
      the golden ratio squared is 2.6179240000000004
Example Inputs/Outputs

enter YYYYMMDD date:  20140131
20140131: 1/31/2014 (U.S.) ... 31/1/2014 (most widely used)

enter waist circumference (in inches): 36
enter weight (in pounds): 190
enter height (in feet and inches): 5 9
BMI: 28.0550304557866
ABSI: 0.4693939190585873

This program showcases understanding of Math.pow(); integer division & modulus operator; and equations
 */

public class MoreArithmetic {

}
