/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Triangle.java
 *  Execution:    java -cp bin com.bridgelabz.util.Triangle
 *  
 *  Purpose: To obtain the area of a triangle.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Double;

public class Triangle{
public static void main(String args[]){

//Accepting the 3 sides of a triangle from the user.
double side1 = Double.parseDouble(args[0]);
double side2 = Double.parseDouble(args[1]);
double side3 = Double.parseDouble(args[2]);

//Displaying the accepted values of the sides.
System.out.println("The value of sides a triangle entered are as follows: a.) "+side1+" , b.) "+side2+" , c.) " +side3);

double s = (side1+side2+side3)/2;

double a = s-side1; 
double b = s-side2;
double c = s-side3;

//Formula to obtain the area of the triangle.
double AreaOfTriangle = Math.sqrt(s*(a*b*c));

System.out.println("The area of the triangle obtained is " +AreaOfTriangle);

}
}