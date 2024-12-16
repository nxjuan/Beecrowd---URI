import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      double A = sc.nextDouble();
      double B = sc.nextDouble();
      System.out.printf("MEDIA = %.5f\n", ((A*3.5)+(B*7.5))/11.0);
    }
}
