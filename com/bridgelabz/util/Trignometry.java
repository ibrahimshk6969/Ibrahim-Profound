public class Trignometry{
public static void main(String args []){

    double degrees = Double.parseDouble(args [0]);
    double radians = Math.toRadians(degrees);

    double sinResult = Math.sin(radians);
    System.out.println("sin(" +degrees+ ")= "+sinResult);

    double cosResult = Math.cos(radians);
    System.out.println("cos(" +degrees+ ")= "+cosResult);

    double tanResult = Math.tan(radians);
    System.out.println("cos(" +degrees+ ")= "+tanResult);
    System.out.println("cos(sinResult+ "/" +cosResult)+ "=" +sinResult/cosResult);

    double Result = sinResult*sinResult + cosResult*cosResult;
    System.out.println(sinResult*sinResult+ "+" +cosResult*cosResult+ "=" +Result);

    }
    }