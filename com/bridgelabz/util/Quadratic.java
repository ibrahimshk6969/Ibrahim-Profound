/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic 
 *  
 *  Purpose: To determine the roots of a quadratic equation.
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

class Quadratic{
public static void main(String args []){

//Accepting the values of a,b,c from the user as inputs in the quadratic equation.
double a = Double.parseDouble(args [0]);
double b = Double.parseDouble(args [1]);
double c = Double.parseDouble(args [2]);

//Displaying the accepted values of a,b,c.
System.out.println("The values entered for a,b,c are as follows : "+a+" , "+b+" and "+c+" respectively.");

//Displaying the accepted values of a,b,c in terms of Quadratic Equation.
System.out.println("The quadratic equation is : "+a+"x^2 + "+b+"x + " +c);

//Calculation the value of delta. 
double delta = b*b - 4*a*c;

//Displaying the value of delta.
System.out.println("The value of delta is : " +delta);

/* Using if-conditional operator to check whether the value of delta is greater than 0 or not.
* If yes then go on to calculate the roots, else go to check other conditions.
*/
if(delta>0){

double root1 = -b + (Math.sqrt(delta)/2*a); 
double root2 = -b - (Math.sqrt(delta)/2*a);

//Displaying the values of the roots.
System.out.println("The value of first root of x is : " +root1);
System.out.println("The value of second root of x is : " +root2); 
}

else if(delta == 0){

System.out.println(" The Roots are real and equal. ");
double root1 = -b + (Math.sqrt(delta)/2*a);
System.out.println("The value of first root of x is : " +root1);
}

else{

System.out.println(" The Roots are imaginery.");
}
}
}