import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double pi = 3.14159;
    System.out.printf("TRIANGULO: %.3f\n", (a*c)/2.0);
    System.out.printf("CIRCULO: %.3f\n", pi * Math.pow(c, 2.0));
    System.out.printf("TRAPEZIO: %.3f\n", ((a+b)*c)/2.0);
    System.out.printf("QUADRADO: %.3f\n", Math.pow(b, 2));
    System.out.printf("RETANGULO: %.3f\n", a * b);
  }
}