import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.0");
    Scanner sc = new Scanner(System.in);
    double n1, n2, n3;
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();

    if(
      n1 > Math.abs(n2-n3) && n1 < n2+n3 ||
      n2 > Math.abs(n1-n3) && n2 < n1+n3 ||
      n3 > Math.abs(n1-n2) && n3 < n1+n2
    ){
      System.out.println("Perimetro = " + df.format(n1+n2+n3));
    }else{
      System.out.println("Area = " + df.format(((n1+n2)*n3)/2));
    }
  }
}