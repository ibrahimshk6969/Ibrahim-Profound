/************************************************
*Compilation: javac PrimeChecker.java
*Execution: java PrimeChecker
*
*Purpose: To check the Prime Number.
*
*@author Ibrahim 
*************************************************/

import java.util.Scanner;
class PrimeChecker{

  public static void main(String args[]){

    int InputNumber;
    int Number;

    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Input Number:");
    InputNumber= scanner.nextInt();

     for(Number=2;Number<InputNumber;Number++){
       if(InputNumber%Number==0){
          System.out.println("IT IS NOT PRIME NUMBER");
          break;
   }
   }
       if(Number==InputNumber){
         System.out.println("IT IS PRIME NUMBER");
   }
      
   }
   }
