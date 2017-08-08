class CarLoan{
public static void main(String args[]){

double pay = Double.parseDouble(args[0]);
double year = Double.parseDouble(args[1]);
double interest = Double.parseDouble(args[2]);

System.out.println("The value entered for payment is" +pay+ " year is " +year+ " and interest is " +interest);

double n=12*year;
double r=interest/(12*100);
double k=1+r;
double monthlypayment=(pay*r)/(1-Math.pow(k,-n));

System.out.println("The result is " +monthlypayment);

}
}