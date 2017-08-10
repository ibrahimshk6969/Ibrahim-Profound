public class IntOpt{
public static void main (String args[]){

double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double c = Double.parseDouble(args[2]);

System.out.println("The entered values are as follows : "+a+" , "+b+" , " +c);

double result1 = a + b * c;
double result2 = a * b + c;
double result3 = c + a / b;
double result4 = a % b + c;

System.out.println(" Result for "+a+" + "+b+" * "+c+" = " +result1);
System.out.println(" Result for "+a+" * "+b+" + "+c+" = " +result2);
System.out.println(" Result for "+a+" + "+b+" / "+c+" = " +result3);
System.out.println(" Result for "+a+" % "+b+" + "+c+" = " +result4);

}
}