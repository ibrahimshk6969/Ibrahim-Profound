public class PowerOfTwo{
public static void main(String args []){

int InputNumber = Integer.parseInt(args [0]);
System.out.println("The value of InputNumber entered is : " +InputNumber);

if(InputNumber>=0 && InputNumber<=31){

for(int i=0;i<InputNumber;i++){

System.out.println("The table is "+i+")   2^"+i+" = "+Math.pow(2,i));

}
}

}
}