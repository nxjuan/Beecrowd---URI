import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    int id1 = sc.nextInt();
    double np1 = sc.nextDouble();
    double val1 = sc.nextDouble();    
    
    int id2 = sc.nextInt();    
    double np2 = sc.nextDouble();
    double val2 = sc.nextDouble();

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", (np1*val1)+(np2*val2));
  }
}