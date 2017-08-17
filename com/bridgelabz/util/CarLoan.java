/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan 
 *  
 *  Purpose: To calculate the compound interest for a CarLoan.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.lang.Double;

class CarLoan
{
/*Accepting the inputs for Principal, Year and Interest of the 
* installments for the calculation of the monthly payments from the user.
*/
    double principal = Double.parseDouble(args[0]);
    double year      = Double.parseDouble(args[1]);
    double interest  = Double.parseDouble(args[2]);

   public static void main(String args[])
      {
//Displaying of the input values taken from the user.
         System.out.println("The value entered for principal is" +principal+ 
	 " year is " +year+ " and interest is " +interest);

//Calculation of the values in n,k,r respectively.
	 double n=12*year;
	 double r=interest/(12*100);
	 double k=1+r;

//Formula for calcultion of the monthly payments to be made on the loan taken.
	double monthlypayment=(principal*r)/(1-Math.pow(k,-n));

//Displaying of the Monthly Payment to be made.
         System.out.println("The result is " +monthlypayment);

      }
}