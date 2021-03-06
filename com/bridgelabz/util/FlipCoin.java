/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin 
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

public class FlipCoin
{
	static int flipTimes;
	static int headTimes=0;
	static int tailTimes=0;
	static int totalTimes;
	static int counter;
	static int headPercent;
	static int tailPercent;

	public static void main(String args [])
	{
		flipTimes = Integer.parseInt(args [0]);
		System.out.println("Number of times the coin is to be flipped is " +flipTimes);
		
		for(counter=1;counter<=flipTimes;counter++)
		{
			if (Math.random()<0.5)
			{	
				headTimes++;
			}
			else
			{
				tailTimes++;
			}
			totalTimes++;
		}
		System.out.println("Number of heads appeared is " +headTimes+ 
		" whereas Number of tails are " +tailTimes);

		headPercent = (headTimes*100)/total;
		tailPercent = (tailTimes*100)/total;

		System.out.println("Percentage of heads appeared is " +headPercent+
		" whereas Percentage of tails appeared is " +tailPercent); 	
	}
}
