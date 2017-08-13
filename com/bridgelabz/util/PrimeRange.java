/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrimeRange.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeRange
 *  
 *  Purpose: To calculate the prime numbers within a given range.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
//Package naming style
package com.bridgelabz.util;
import java.lang.Double;

public class PrimeRange
{
	static int startPoint;
	static int endPoint;
	static int flag=0,ctr1,ctr2;
	public static void main(String args[])
	{		
		startPoint = Integer.parseInt(args[0]);
		endPoint = Integer.parseInt(args[1]);
		System.out.println("The value for start of the range is " +startPoint+ 
		"and for the end of the range is " +endPoint);		

		for(ctr1=startPoint;ctr1<=endPoint;ctr1++)
		{
			for(ctr2=2;ctr2<ctr1;ctr2++)
			{
				if(ctr1%ctr2==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(ctr1);
			}
		}

	}
}
