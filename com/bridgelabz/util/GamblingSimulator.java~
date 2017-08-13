/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/GamblingSimulator.java
 *  Execution:    java -cp bin com.bridgelabz.util.GamblingSimulator
 *  
 *  Purpose: To stimulate the wins and losses of gambler.
 *
 *  @author  Ibrahim
 *  @version 1.0
 *  @since   11-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.lang.Integer;

public class GamblingSimulator
{ 
		public static void main(String[] args)
		{
     		int stake=Integer.parseInt(args[0]);   						 	// gambler's stating bankroll
        int goals=Integer.parseInt(args[1]);    							// gambler's desired bankroll
        int trials=Integer.parseInt(args[2]);    							// number of trials to perform

        int bets=0;        																		// total number of bets made
        int wins=0;        																		// total number of games won

        for (int counter=0;counter<trials;counter++)          	// repeat trials times
				{
            int cash=stake;
		            while(cash>0&&cash<goals)
								{
	                     bets++;

		                if(Math.random()<0.5)
										{
											 cash++;     															// wins $1
		                }
										
										else
                    {
											 cash--;     															// lose $1
		            		}
            		}		
										if(cash==goals)
										{
											 wins++;                									// did gambler go achieve desired goal?
       						  }
								
        																												// print results
       		 System.out.println(wins + " wins of " + trials);
        	 System.out.println("Percent of games won = " + 100.0 * wins / trials);
        	
 		   }

		}

}
