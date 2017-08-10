import java.util.*;

public class TemperatureConversion{
public static void main(String args[]){

Scanner sc = new Scanner (System.in);

int TempCel = Integer.parseInt(args[0]);
int TempFar = Integer.parseInt(args[1]); 

System.out.println();
System.out.println("The temperature in celsius entered is : " +TempCel+ " celsius");
System.out.println("The temperature in fahrenheit entered is : " +TempFar+ " fahrenheit");
System.out.println();

System.out.println("MENU:");
System.out.println(" 1.Celsius to Fahrenheit. ");
System.out.println(" 2.Fahrenheit to Celsius. ");
System.out.println();

System.out.println("Enter your choice: " );
int Result = sc.nextInt();

System.out.println("The entered choice is : " +Result);
switch(Result){

case 1: int ResultFar=(TempCel*9/5)+32;
System.out.println("The "+TempCel+" in celsius is converted to " +ResultFar+ " in fahrenheit.");
break;

case 2: int ResultCel=(TempFar-32)*5/9;
System.out.println("The "+TempFar+" in fahrenheit is converted to " +ResultCel+ " in celsius. ");
break;

default: System.out.println("Invalid Entry");
}
}
}