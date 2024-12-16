import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();

    System.out.printf("MEDIA = %.1f\n", ((A*2)+(B*3)+(C*5))/10);

  }
}