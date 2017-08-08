class Chill{
public static void main(String args[]){

int temp = Integer.parseInt(args[0]);
int velocity = Integer.parseInt(args[1]);

System.out.println("The entered values for temperature is " + temp + " and velcity is " +velocity);

double w = 35.74+0.6215*temp+(0.4275*temp - 35.75)*Math.pow(velocity,0.16);

System.out.println("the value of windchill is "+w);

}
} 