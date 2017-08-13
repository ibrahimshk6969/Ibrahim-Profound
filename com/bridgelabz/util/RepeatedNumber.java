/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RepeatedNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.RepeatedNumber 
 *  
 *  Purpose: To determines the day of the week.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;

import java.lang.Integer;

class RepeatedNumber{
public static void main(String args[]){

//Creating a pre-defined array to check which element in it gets repeated.
int array[] = {1,2,3,4,5,6,7,8,9,1};

/*Using fact1 and fact2 as loop counters.
* Using 2 for-loop inorder to find the repeating element in the array.
*/
for(int fact1=0;fact1<array.length-1;fact1++){
for(int fact2=fact1+1;fact2<array.length;fact2++){

//Using if conditional operator to check the repeated element.
if(array[fact1]==array[fact2]){

//Displaying the repeated element.
System.out.println("The Duplicate Number is : " +array[fact2]);
}

}
}

}
}