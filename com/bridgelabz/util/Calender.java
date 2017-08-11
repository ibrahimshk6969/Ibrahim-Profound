/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Calender.java
 *  Execution:    java -cp bin com.bridgelabz.util.Calender 
 *  
 *  Purpose: To determines the day of the week.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Integer;

public class Calender{
      public static void main(String args[]){

//Accepting the day,month,year from command line arguments.
	int day = Integer.parseInt(args [0]);
	int month = Integer.parseInt(args [1]);
	int year = Integer.parseInt(args [2]);

//Displaying the accepted values.
		System.out.println("The day is " +day+ " month is " +month+ " and year is " +year);

//Formula for calculation of the same ie. year,leapyear,month and displaying of the day.

	int y = year-(14-month)/12;
	int x = y+(y/4)-(y/100)+(y/400);
	int m = month+12*((14-month)/12)-2;
	int d = (day+x+(31*m)/12)%7;

//Displaying of the resultant day in terms of integer values ranging from 0-7 with 0 being Sunday, 1 being Monday and so on..
		System.out.println("the result is "+d);
		    }
 	            }