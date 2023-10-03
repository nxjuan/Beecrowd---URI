import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i=0;
    for(int c = 1; c <= 6; c++){
      double v = sc.nextDouble(); 
      if(v > 0){
        i++;
      }
    }
    System.out.println(i + " valores positivos");
  }
}