/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargest_SecondSmallest.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargest_SecondSmallest 
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

import java.lang.Integer;
import java.util.Scanner;

public class SecondLargest_SecondSmallest{
    public static void main(String[] args){

//Creating 2 variables InputNo to accept the no. of values to be stored in the array and a temporary variable.
        int InputNo ,Temporary;

//Creating a scanner variable.
        Scanner scanner = new Scanner(System.in);

//Displaying the no of inputs required to be given to the array.
        System.out.println("Enter the number of elements you want in an array: ");
        
//Accepting the inputs via the scanner.
	InputNo = scanner.nextInt();
        
//Putting the elements of the InputNo. in the array
	int array[] = new int[InputNo];
        System.out.println("Enter all the elements:");
        
/*Implementation of for-loop for initialization of the array
* using fact1 as counter for the loop.
*/
	for (int fact1=0;fact1<InputNo;fact1++) 
        {
            array[fact1] = scanner.nextInt();
        }

//Using 2nd for-loop for finding the 2nd largest and 2nd smallest values
        for (int fact1=0;fact1<InputNo;fact1++) 
        {
            for (int fact2=fact1+1;fact2<InputNo;fact2++) 
            {
                if (array[fact1]>array[fact2]) 
                {
                    Temporary=array[fact1];
                    array[fact1] = array[fact2];
                    array[fact2] = Temporary;
                }
            }
        }

//Displaying the 2nd largest and 2nd smallest values.
        System.out.println("Second Largest value is :" +array[InputNo-2]);
        System.out.println("Second Smallest value is :" +array[1]);
    }
}