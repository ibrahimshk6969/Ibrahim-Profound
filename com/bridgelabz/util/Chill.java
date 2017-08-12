/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Chill.java
 *  Execution:    java -cp bin com.bridgelabz.util.Chill 
 *  
 *  Purpose: To calculate the WindChill.
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

class Chill{
public static void main(String args[]){

//Accepting the inputs for Temperature(temp) and Velocity from the user respectively.
int temp = Integer.parseInt(args[0]);
int velocity = Integer.parseInt(args[1]);

//Displaying of the values accepted from the user for Temperature and Velocity.
System.out.println("The entered values for temperature is " + temp + " and velcity is " +velocity);

//Formula for calculation of windchill.
//Using mathematical function Math.pow().
 double windchill = 35.74+0.6215*temp+(0.4275*temp - 35.75)*Math.pow(velocity,0.16);

//Displayin the obtained value of windchill. 
System.out.println("the value of windchill is "+windchill);

}
} 