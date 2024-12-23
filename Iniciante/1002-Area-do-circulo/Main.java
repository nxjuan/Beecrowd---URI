import java.util.Locale;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double n = 3.14159;
    double raio = sc.nextDouble();
    System.out.printf("A = %.4f\n", Math.pow(raio, 2) * n);
    sc.close();
  }
}