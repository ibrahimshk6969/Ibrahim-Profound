/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Stats5.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stats5 
 *  
 *  Purpose: To stimulate a coin flip.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.lang.Integer;

public class Stats5
{
		public static void main(String args [])
		{
				int array[] = new int [n];
				int n=5;
				int ctr2;
				for(int ctr1=0;ctr1<5;ctr1++)
				{
						for(ctr2=0;ctr2<n;ctr2++)
						{
							array[n] = Math.random();
						}
				}
				System.out.println("The values in the array are : " +array[n]);
		}
}
