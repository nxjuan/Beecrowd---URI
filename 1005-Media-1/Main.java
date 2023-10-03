import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      double A = sc.nextDouble();
      double B = sc.nextDouble();
      System.out.printf("MEDIA = %.5f\n", (A+B)/2);
    }
}