/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason
 *  
 *  Purpose: To determine whether it is Spring Season or not.
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

	public class SpringSeason{
	public static void main (String args[]){

//Accepting the month and day values from the user to check whether it is spring season or not.
int month = Integer.parseInt(args [0]);
int day   = Integer.parseInt(args [1]);

/*Using boolean data type to see whether the entered value satisfy the giving condition
* if yes then display true else false.
*/
boolean isSpring = ( month == 3 && day >= 20 && day <= 31 )
		 ||( month == 4 && day >= 1 && day <= 30 )
		 ||( month == 5 && day >= 1 && day <= 31 )
		 ||( month == 6 && day >= 1 && day <= 20 );

//Displayin whether it is spring season or not in terms of true or false.
System.out.println(isSpring);

}
}