import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1, n2, n3;

   
    n3 = sc.nextDouble();
    n2 = sc.nextDouble();
    n1 = sc.nextDouble();
    
    
    List<Double> lista = new ArrayList<>();
    lista.add(n1);
    lista.add(n2);
    lista.add(n3);
    
    Collections.sort(lista);

   
    n1 = lista.get(2);
    n2 = lista.get(1);
    n3 = lista.get(0);
    
   
    if (!(n1 >= n2 + n3)) {
      
     
      if ((n1 * n1) == (n2 * n2) + (n3 * n3)) {
        System.out.println("TRIANGULO RETANGULO");
      } else if ((n1 * n1) > (n2 * n2) + (n3 * n3)) {
        System.out.println("TRIANGULO OBTUSANGULO");
      } else {
        System.out.println("TRIANGULO ACUTANGULO");
      }
      
      
      if (n1 == n2 && n2 == n3) {
        System.out.println("TRIANGULO EQUILATERO");
      } else if (n1 == n2 || n2 == n3 || n1 == n3) {
        System.out.println("TRIANGULO ISOSCELES");
      }
      
    } else {
      System.out.println("NAO FORMA TRIANGULO");
    }
    
    sc.close();
  }
}
