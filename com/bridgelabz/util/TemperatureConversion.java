/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion 
 *  
 *  Purpose: For conversion of input temperature from fahrenheit to celsius and vice-versa.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.util.scanner;
import java.lang.Integer;

public class TemperatureConversion{
public static void main(String args[]){

Scanner sc = new Scanner (System.in);
 
//Accepting values from the user for both temperature in celsius and fahrenheit.
int TempCel = Integer.parseInt(args[0]);
int TempFar = Integer.parseInt(args[1]); 

System.out.println();

//Displaying the accepted values.
System.out.println("The temperature in celsius entered is : " +TempCel+ " celsius");
System.out.println("The temperature in fahrenheit entered is : " +TempFar+ " fahrenheit");
System.out.println();

//Menu for selecting the operation to be performed.
System.out.println("MENU:");
System.out.println(" 1.Celsius to Fahrenheit. ");
System.out.println(" 2.Fahrenheit to Celsius. ");
System.out.println();

//Displaying of the selected choice.
System.out.println("Enter your choice: " );
int Result = sc.nextInt();

System.out.println("The entered choice is : " +Result);

//using switch case for performing the desired option of conversation of temperature.
switch(Result){

//Case for conversion of temperature into fahrenheit.
case 1: int ResultFar=(TempCel*9/5)+32;
System.out.println("The "+TempCel+" in celsius is converted to " +ResultFar+ " in fahrenheit.");
break;

//Case for conversion of temperature into celsius.
case 2: int ResultCel=(TempFar-32)*5/9;
System.out.println("The "+TempFar+" in fahrenheit is converted to " +ResultCel+ " in celsius. ");
break;

default: System.out.println("Invalid Entry");
}
}
}