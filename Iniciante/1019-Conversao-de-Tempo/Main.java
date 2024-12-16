import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = (int)n / 60;
    int seg = (int)n % 60;
    int h=0;
    if(min>59){
      h = (int)min / 60;
      min = (int)min - (h * 60);
    }    
    
    System.out.printf("%d:%d:%d\n", h, min, seg);
  }
}