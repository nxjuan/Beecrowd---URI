import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double pi = 3.14159;
    double r = sc.nextDouble();
    System.out.printf("VOLUME = %.3f\n", (4.0/3.0) * pi * Math.pow(r, 3));
  }
}