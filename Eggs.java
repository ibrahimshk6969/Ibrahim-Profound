/**************************************
*Compilation: javac.EggDozen.java
*Execution:   java.EggDozen
*
*Purpose:     To find the number of Eggs.
*
*@author:     ibrahim
*
***************************************/

import java.util.Scanner;
class Eggs{
           public static void main(String args[])
           {
            int NumberOfEggs,Result1,Result2;
            
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the No. of Eggs:");
            NumberOfEggs=scanner.nextInt();

            Result1=NumberOfEggs/12;
            Result2=NumberOfEggs%12;

            System.out.println("The number of eggs are "+Result1+" dozen and "+Result2+" eggs ");
          }
          }   
