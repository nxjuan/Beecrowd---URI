import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int item = sc.nextInt();
    int qtd = sc.nextInt();
    double val;

    switch (item) {
      case 1:
        val = 4.00;
        break;
      case 2:
        val = 4.50;
        break;
      case 3:
        val = 5.00;
        break;
      case 4:
        val = 2.00;
        break;
      case 5:
        val = 1.50;
        break;
      default:
        val = 0;
        break;
    }
    System.out.printf("Total: R$ %.2f\n", val*qtd);
  }
}