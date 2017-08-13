/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt 
 *  
 *  Purpose: To calculate the SquareRoot using Newton's Method.
 *
 * Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached
 *     - using Math.abs() is required if c < 1

 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Double;
import java.lang.Integer;

class Sqrt { 
    public static void main(String[] args) { 

//Accepting input values from the command-line argument
        double c = Double.parseDouble(args[0]);

//Finding the relative error tolerance
        double epsilon = 1e-15;

//Estimating of the square root of c    
        double t = c;
              
//Apply the formula repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

//Displaying the estimate of the square root of c
        System.out.println(t);
    }

}
