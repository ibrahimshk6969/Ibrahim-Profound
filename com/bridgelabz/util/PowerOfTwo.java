/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOfTwo.java
 *  Execution:   java -cp bin com.bridgelabz.util.PowerOfTwo
 *  
 *  Purpose: To obtain the table of power of 2.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Integer;

	public class PowerOfTwo{
	public static void main(String args []){

//Accepting input value from the user inorder to calculate the number of power of 2 values to be obtained.
	     int InputNumber = Integer.parseInt(args [0]);

//Displaying the value accepted by the user.
	         System.out.println("The value of InputNumber entered is : " +InputNumber);

//Using if-conditional operator to check whether the input number is greater than and less than 0 and 31 respectively.
           		   if(InputNumber>=0 && InputNumber<=31){

//Applying for loop with fact as the counter.
			   for(int fact=0;fact<=InputNumber;fact++){

//Displaying the power of two and using mathematical function Math.pow to obtain the power.
		System.out.println("The table is "+fact+")   2^"+fact+" = "+Math.pow(2,fact));

	}
	}

}
}