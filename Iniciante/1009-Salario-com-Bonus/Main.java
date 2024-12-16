import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    String nome = sc.next();
    double sal = sc.nextDouble();
    double vend = sc.nextDouble();
    double val = (vend * 15) / 100;
    System.out.printf("TOTAL = R$ %.2f\n", sal+val);
  }
}