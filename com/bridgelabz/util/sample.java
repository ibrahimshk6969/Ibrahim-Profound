/**************************************
*Compilation: 
*Execution:   
*
*Purpose:     To display HELLO WORLD.
*
*@author:     ibrahim
*
***************************************/
package com.bridgelabz.util;

class PrimeCheck{

       public static void main(String args[]){
       int InputNumber;
       int Number;
       int Counter=0;

  
       for(InputNumber=1;InputNumber<100000;InputNumber++){
       for(Number=1;Number<10;Number++){
        if(InputNumber%Number==0){
         Counter++;
         break;
         }
         }

         if(Counter<=2){
          
         }
         }

        System.out.println("The count is : "+Counter);
         }
         }

