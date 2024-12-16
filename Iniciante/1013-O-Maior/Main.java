import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val, maior=0;
    for(int i = 1; i<=3; i++){
      val = sc.nextInt();
      if(i == 1){
        maior = val;
      }
      if(maior<val){
        maior = val;
      }
    }
    System.out.println(maior + " eh o maior");
  }
}