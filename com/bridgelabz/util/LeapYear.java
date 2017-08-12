/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:     javac -d bin com/bridgelabz/util/LeapYear.java
 *  
 *  Purpose: To check whether the year is a leap year or not.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Boolean;
import java.lang.Integer;

	public class LeapYear{
		public static void main(String args[]){

//Accepting the input values of year from the user using command line argument.
 		   int year = Integer.parseInt(args[0]);

/*Creating a variable isLeapYear having data type boolean to check whether 
* the input year is leap year or not.
*/

		  boolean isLeapYear;

//Condition check for leap year, if condition is true it will show true else false.
			    isLeapYear = (year%4==0);
    		            isLeapYear = isLeapYear && (year%100 != 0);
    			    isLeapYear = isLeapYear || (year%400 == 0);

//Displyaing the result in boolean ie true or false.
			    System.out.println(isLeapYear);
 	}
 	}