class Calender{
public static void main(String args[]){

int day = Integer.parseInt(args [0]);
int month = Integer.parseInt(args [1]);
int year = Integer.parseInt(args [2]);

System.out.println("The day is " +day+ " month is " +month+ " and year is " +year);

int y = year-(14-month)/12;
int x = y+(y/4)-(y/100)+(y/400);
int m = month+12*((14-month)/12)-2;
int d = (day+x+(31*m)/12)%7;

System.out.println("the result is "+d);
 }
 }