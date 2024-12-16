import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, dez=0, cem=0, uni=0, vint=0, cinq=0, dois=0, cinc=0;
    n = sc.nextInt();
    cem = (int)n / 100;   
    dez = (int)n % 100;
    uni = (int)dez % 10;
    dez = (int)dez / 10;
    
    //criando nota de cinquenta
    if(dez >= 5){
      dez -= 5;
      cinq++;
    }

    //criando nota de vinte
    if(dez >= 4){
        dez -=4;
        vint += 2;
    }else if(dez >= 2){      
      dez -= 2;
      vint += 1;
    }

    //criando notas de cinco
    if(uni>=5){
      uni = uni - 5;
      cinc++;
    }

    //Criando nota de dois
    if(uni >= 2){
      if(uni % 2 == 0){
        dois = uni/2;
      }else{
        dois = (uni-1)/2;
      }
    }
    uni = uni - (dois*2);

    System.out.printf("%d\n",n);
    System.out.printf("%d nota(s) de R$ 100,00\n", cem);
    System.out.printf("%d nota(s) de R$ 50,00\n", cinq);
    System.out.printf("%d nota(s) de R$ 20,00\n", vint);
    System.out.printf("%d nota(s) de R$ 10,00\n", dez);
    System.out.printf("%d nota(s) de R$ 5,00\n", cinc);
    System.out.printf("%d nota(s) de R$ 2,00\n", dois);
    System.out.printf("%d nota(s) de R$ 1,00\n", uni);
  }
}