/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/NoSuchMethod.java
 *  Execution:    java -cp bin com.bridgelabz.util.NoSuchMethod 
 *  
 *  Purpose: To display no such method error.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Integer;
import java.lang.Add;
	class NoSuchMethod{
		public static void main(String args[]){

//Accepting input values from the user.
			int Input1 = Integer.parseInt(args [0]);
			int Input2 = Integer.parseInt(args [1]); 

//Displaying the entered values.
	System.out.println("The values entered are : " +Input1+ " and " +Input2);

//Calling Add() method to display no such method error as the method has not been created anywhere in the program.
			int Addition = Add();

	}
	}