/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt 
 *  
 *  Purpose: To perform mathematical operations for understanding the precedence of the operators using Integer as the datatype.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Integer;

public class IntOpt{
public static void main (String args[]){

//Accepting the inputs for a,b,c to perform mathematical operations. 
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);

//Displaying of values taken as input for a,b,c respectively.
System.out.println("The entered values are as follows : "+a+" , "+b+" , " +c);

//Formulae for performing various mathematical operations.
int result1 = a + b * c;
int result2 = a * b + c;
int result3 = c + a / b;
int result4 = a % b + c;

//Displaying the result of the performed mathematical operations.
System.out.println(" Result for "+a+" + "+b+" * "+c+" = " +result1);
System.out.println(" Result for "+a+" * "+b+" + "+c+" = " +result2);
System.out.println(" Result for "+a+" + "+b+" / "+c+" = " +result3);
System.out.println(" Result for "+a+" % "+b+" + "+c+" = " +result4);

}
}