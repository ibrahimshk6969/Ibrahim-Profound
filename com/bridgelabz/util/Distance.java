/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance 
 *  
 *  Purpose: To calculate the Euclidean Distance between the points(x,y) and the origin(0,0) .
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Double;

public class Distance{
public static void main(String args []){

//Accepting the input values for the x and y co-ordinates respectively.
double x = Double.parseDouble(args [0]);
double y = Double.parseDouble(args [1]);

//Formula for obtaining the Euclidean Distance.
//Use of mathematical function math.sqrt for calculation of squareroot.
double dist = Math.sqrt(x*x + y*y);

//Displaying of the Euclidean distance.
System.out.println("Distance from ("+x+","+y+") to (0,0) = " +dist);

}
}