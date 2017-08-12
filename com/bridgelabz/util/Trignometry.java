/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Trignometry.java
 *  Execution:    java -cp bin com.bridgelabz.util.Trignometry 
 *  
 *  Purpose: To perform various trignometry operations.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Double;

public class Trignometry{
public static void main(String args []){

//Accepting a value in degree from the user. 
    double degrees = Double.parseDouble(args [0]);

//Converting the accepted value in degree to radians.
    double radians = Math.toRadians(degrees);

//Calculating the value of sin in radians and displaying the same
    double sinResult = Math.sin(radians);
    System.out.println("sin(" +degrees+ ")= "+sinResult);

//Calculating the value of cos in radians and displaying the same
    double cosResult = Math.cos(radians);
    System.out.println("cos(" +degrees+ ")= "+cosResult);

//Calculating the value of tan in radians and displaying the same
    double tanResult = Math.tan(radians);
    System.out.println("cos(" +degrees+ ")= "+tanResult);
    System.out.println("cos(sinResult+ "/" +cosResult)+ "=" +sinResult/cosResult);

    double Result = sinResult*sinResult + cosResult*cosResult;
    System.out.println(sinResult*sinResult+ "+" +cosResult*cosResult+ "=" +Result);

    }
    }