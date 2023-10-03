import java.util.Scanner;
class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1, n2, n3, n4, newExam;
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    n4 = sc.nextDouble();

    double m = ((n1*2) + (n2*3) + (n3 * 4) + n4) / 10;

    if(m >= 7){
      System.out.printf("Media: %.1f\n", m);
      System.out.println("Aluno aprovado.");
    }else if(m >= 5 && m < 7){
      System.out.printf("Media: %.1f\n", m);
      System.out.println("Aluno em exame.");
      System.out.print("Nota do exame: ");
      newExam = sc.nextDouble(); 
      m = (m + newExam) / 2;
      if(m >= 5){
        System.out.println("Aluno aprovado.");
        System.out.printf("Media final: %.1f\n", m);
      }else{
        System.out.println("Aluno reprovado.");
        System.out.printf("Media final: %.1f\n", m);
      }
    }else{
      System.out.printf("Media: %.1f\n");
      System.out.println("Aluno reprovado.");
    }
  }
}