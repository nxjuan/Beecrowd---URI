import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");
    df.setRoundingMode(java.math.RoundingMode.DOWN);

    String StringNotas = sc.nextLine();

    String[] ArrayNota = StringNotas.split(" ");

    double[] notas = new double[ArrayNota.length];

    for (int i = 0; i < ArrayNota.length; i++){
      notas[i] = Double.parseDouble(ArrayNota[i]);
    }    

    double m = ((notas[0]*2) + (notas[1]*3) + (notas[2] * 4) + notas[3]) / 10;

    // System.out.println(StringNotas);

    if(m >= 7){
      System.out.println("Media: " + df.format(m));
      System.out.println("Aluno aprovado.");
    }else if(m >= 5 && m < 7){
      System.out.println("Media: " + df.format(m));
      System.out.println("Aluno em exame.");
      
      double notaExame = sc.nextDouble();
      
      System.out.println("Nota do exame: " + df.format(notaExame));
      
      // sc.nextLine(); // Consumir a nova linha pendente

      m = (m + notaExame) / 2;

      if(m >= 5){
        System.out.println("Aluno aprovado.");
        System.out.println("Media final: " + df.format(m));
      }else{
        System.out.println("Aluno reprovado.");
        System.out.println("Media final: " + df.format(m));
      }
    }else{
      System.out.println("Media: " + df.format(m));
      System.out.println("Aluno reprovado.");
    }
  }
}