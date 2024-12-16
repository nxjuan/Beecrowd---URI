import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    int y = val / 365;    
    int m = (val - y * 365 ) / 30;    
    int d = (val - ( y * 365 ) - ( m * 30))  ;
    
    System.out.println(y + " ano(s)");
    System.out.println(m + " mes(es)");
    System.out.println(d + " dia(s)");
  }
}