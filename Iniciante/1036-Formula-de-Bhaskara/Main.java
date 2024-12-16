import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double a, b, c, del, x1, x2;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    del = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    x1 = ((b*(-1)) + del)/(2*a);
    x2 = ((b*(-1)) - del)/(2*a);
    if(del.isNaN() || x1.isNaN() || x2.isNaN()){
      System.out.println("Impossivel calcular");
    }else{      
      System.out.printf("R1 = %.5f\n", x1);
      System.out.printf("R2 = %.5f\n", x2);
    }    
  }
}