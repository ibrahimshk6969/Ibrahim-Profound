public class Triangle{
public static void main(String args[]){

double side1 = Double.parseDouble(args[0]);
double side2 = Double.parseDouble(args[1]);
double side3 = Double.parseDouble(args[2]);

System.out.println("The value of sides a triangle entered are as follows: a.) "+side1+" , b.) "+side2+" , c.) " +side3);

double s = (side1+side2+side3)/2;

double a = s-side1; 
double b = s-side2;
double c = s-side3;

double AreaOfTriangle = Math.sqrt(s*(a*b*c));

System.out.println("The area of the triangle obtained is " +AreaOfTriangle);

}
}