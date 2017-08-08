public class DoubleOps{
public static void main(String args[]){

   double value1 = Double.parseDouble(args [0]);
   double value2 = Double.parseDouble(args [1]);
   double sum    = value1 + value2;
   double sub    = value1 - value2;
   double mul    = value1 * value2;
   double div    = value1 / value2;
   double mod    = value1 % value2;

System.out.println(value1 + "+" +value2+ "=" +sum);
System.out.println(value1 + "-" +value2+ "=" +sub);
System.out.println(value1 + "*" +value2+ "=" +mul);
System.out.println(value1 + "/" +value2+ "=" +div);
System.out.println(value1 + "%" +value2+ "=" +mod);

System.out.println();

System.out.println("sin(pi/2)="+Math.sin(Math.PI/2));
System.out.println("log(e)="+Math.log(Math.E));

  }
  }