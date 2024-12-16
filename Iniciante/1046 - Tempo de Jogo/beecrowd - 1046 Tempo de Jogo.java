import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int v1 = sc.nextInt();
    int v2 = sc.nextInt();

    if(v1 == v2) {
      System.out.println("O JOGO DUROU 24 HORA(S)");
    } else {
      int duration;
      if (v1 < v2) {
        duration = v2 - v1;
      } else {
        duration = (24 - v1) + v2;
      }
      System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
  }
}
