/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DoubleOps.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOps 
 *  
 *  Purpose: To perform mathematical operations for understanding the precedence of the operators using double as the datatype.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Double;

public class DoubleOps{
	public static void main(String args[]){

//Accepting two inputs from the user as value1 and value2 to perform mathematical operations. 
	   double value1 = Double.parseDouble(args [0]);
   	   double value2 = Double.parseDouble(args [1]);

//Formulae for calculation of different operations
	   double sum    = value1 + value2;
   	   double sub    = value1 - value2;
  	   double mul    = value1 * value2;
 	   double div    = value1 / value2;
   	   double mod    = value1 % value2;

//Displaying the result of the various mathematical operations performed.
		System.out.println(value1 + "+" +value2+ "=" +sum);
		System.out.println(value1 + "-" +value2+ "=" +sub);
		System.out.println(value1 + "*" +value2+ "=" +mul);
		System.out.println(value1 + "/" +value2+ "=" +div);
		System.out.println(value1 + "%" +value2+ "=" +mod);

//Using System.out.println for leaving and empty line.
     		System.out.println();


//Performing and Displaying of mathematical functions like math.pi and math.log forr calculating log and pi values.
		System.out.println("sin(pi/2)="+Math.sin(Math.PI/2));
		System.out.println("log(e)="+Math.log(Math.E));

  }
  }