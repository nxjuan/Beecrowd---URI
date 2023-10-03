import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double dist = sc.nextDouble();
    double gast = sc.nextDouble();
    
    System.out.printf("%.3f km/l\n", dist/gast);
  }
}