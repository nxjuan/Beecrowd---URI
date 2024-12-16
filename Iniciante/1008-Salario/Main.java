import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Numb = sc.nextInt();
    double horaT = sc.nextDouble();
    double valH = sc.nextDouble();
    System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", Numb, horaT*valH);
  }
}