public class SumOfTwoDice{
public static void main(String args []){

int dice1 = Integer.parseInt(args [0]);
int dice2 = Integer.parseInt(args [1]); 

System.out.println("The number of values required from dice1 is : " +dice1);
System.out.println("The number of values required from dice2 is : " +dice2);

for(int i=0;i<dice1;i++){
for(int j=0;j<dice2;j++){

double result1 = Math.random()*6+1;
double result2 = Math.random()*6+1;

System.out.println("Value for dice1 is : " +result1);
System.out.println("Value for dice2 is : " +result2);

Double Sum = result1 + result2;

System.out.println("The sum of two dice is : " +Sum);

}
}
}
}