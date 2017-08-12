/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfTwoDice
 *  
 *  Purpose: To obtain the Sum of 2 dice using random function.
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

public class SumOfTwoDice{
public static void main(String args []){

//Accepting the no. of values for each dice to be obtained using the random function.
int dice1 = Integer.parseInt(args [0]);
int dice2 = Integer.parseInt(args [1]); 

//Displaying of the values required to be calculated.
System.out.println("The number of values required from dice1 is : " +dice1);
System.out.println("The number of values required from dice2 is : " +dice2);

/*Using fact1, fact2 as counters for implementation of the for-loop.
*using 2 for-loops inorder to obtain 2 different values for two dices.
*/
for(int fact1=0;fact1<dice1;fact1++){
for(int fact2=0;fact2<dice2;fact2++){

double result1 = Math.random()*6+1;
double result2 = Math.random()*6+1;

//Displaying of the values obtaained from the random function for the dice.
System.out.println("Value for dice1 is : " +result1);
System.out.println("Value for dice2 is : " +result2);

//Calculating the sum of the 2 dice.
Double Sum = result1 + result2;

//Displaying the result ie. Sum.
System.out.println("The sum of two dice is : " +Sum);

}
}
}
}