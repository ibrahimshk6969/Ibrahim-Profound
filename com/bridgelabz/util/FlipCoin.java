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
//Package naming style
package com.bridgelabz.util;

public class FlipCoin{
public static void main(String args []){

/*Using mathematical function math.random() to obtain a random value between
* 0 and 1.
*
* Using if condition operator to check whether the value of random function is
* greater than or less than 0.5.
*
* If the value if less than 0.5 print head else tails if greater than 0.5.
*
*Thus getting the stimulation of a coin.
*/

if (Math.random()<0.5)
{
System.out.println("Heads");
}
else
{
System.out.println("Tails");
}

}
}