import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int c = 1; c <= n; c++){
      if(c%2!=0){
        System.out.println(c);
      }
    }
  }
}