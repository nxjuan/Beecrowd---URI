import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double t = sc.nextInt();
    double vm = sc.nextInt();
    double d = (vm * t)/12;    
    System.out.printf("%.3f\n", d);
  }
}