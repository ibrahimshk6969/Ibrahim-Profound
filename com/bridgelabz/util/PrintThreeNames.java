/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose: Displaying the input names taken by the user using command line arguments in reverse order.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

	class PrintThreeNames{
		public static void main(String args[]){

//Taking 3 input names from the user. 
		String name1 = (args [0]);
		String name2 = (args [1]);
		String name3 = (args [2]);

//Displaying the input names in reverse order.
 	System.out.println("The names entered are as follows : "+name3+" "+name2+" "+name1 );

	}
	}