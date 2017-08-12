/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Harmonic 
 *  
 *  Purpose: To obtain the result of harmonic function.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

   import java.lang.Double;
   import java.lang.Integer;

// Returns the result of the harmonic function 1/1 + 1/2 + 1/3 + ... + 1/n 
	public class Harmonic{

//Creating a static method called harmonic having InputNo as its limiting parameter. 
		public static double harmonic(int InputNo){

			double sum = 0.0;

/*Using fact as a for-loop counter parameter.. 
*
*Calculating and storing the harmonic function result in variable sum.

*
*/
		for(int fact=1;fact<=InputNo;fact++){
		
		    sum += 1.0/fact;
	}
	       	    return sum;
	}

	public static void main(String args []){

//Using fact as for-loop counter and calculating the harmonic of the no. taken as input from the user.
		for (int fact=0;fact<args.length;fact++){

//taking 
		     int arg = Integer.parseInt(args[fact]);

//Storing the result of the harmonic class method in variable named value.  
		     double value = harmonic(arg);

//Displaying the result of the harmonic function.
				System.out.println(value);
	}
	}
	}