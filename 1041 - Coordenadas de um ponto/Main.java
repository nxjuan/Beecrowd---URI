import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double n1, n2;
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();

    if(n1 > 0 && n2 > 0){
      System.out.println("Q1");
    }else if(n1 < 0 && n2 > 0){
      System.out.println("Q2");
    }else if(n1 < 0 && n2 < 0){
      System.out.println("Q3");
    }else if(n1 > 0 && n2 < 0){
      System.out.println("Q4");
    }else if(n1 == 0 && n2 == 0){
      System.out.println("Origem");
    }else if(n1 == 0){
      System.out.println("Eixo Y");
    }else if(n2 == 0){
      System.out.println("Eixo X");
    }
  }
}