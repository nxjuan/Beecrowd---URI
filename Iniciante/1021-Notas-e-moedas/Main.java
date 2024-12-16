import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double nd = sc.nextDouble();

    double cem=0, cinq=0, vint=0, dez=0, cinc=0, dois=0, uni=0;
    
    double notas = (int)nd;
    
    double moedas = nd - notas;
    moedas = (moedas * 100);
    moedas = Math.round(moedas);
    

    cem = (int)notas / 100;   
    dez = (int)notas % 100;
    uni = (int)dez % 10;
    dez = (int)dez / 10;

    //-----------------------notas--------------------

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

    //----------------------MOEDAS-----------------------

    double m50=0, m25=0, m10=0, m5=0, m1=0;    

    //criando moeda de 0.50
    
    if(moedas>=50){
      moedas = moedas - 50;
      m50++;
    }

    //criando moedas de 0.25
    if(moedas>=25){
      m25++;
      moedas = moedas - 25;
    }

    //criando moedas de 0.10
    for(;;){
      if(moedas >= 10){
        m10++;
        moedas = moedas-10;
      }else{
        break;
      }
    }

    //criando moedas de 0.05
    if(moedas >= 5){
      m5++;
      moedas = moedas - 5;
    }

    //criando moedas de 0.01
    for(;;){
      if(moedas >= 1){
        m1++;
        moedas--;
      }else{
        break;
      }
    }
    System.out.printf("NOTAS:\n");

    System.out.printf("%.0f nota(s) de R$ 100.00\n", cem);
    System.out.printf("%.0f nota(s) de R$ 50.00\n", cinq);
    System.out.printf("%.0f nota(s) de R$ 20.00\n", vint);
    System.out.printf("%.0f nota(s) de R$ 10.00\n", dez);
    System.out.printf("%.0f nota(s) de R$ 5.00\n", cinc);
    System.out.printf("%.0f nota(s) de R$ 2.00\n", dois);    

    System.out.printf("MOEDAS:\n");

    System.out.printf("%.0f moeda(s) de R$ 1.00\n", uni);
    System.out.printf("%.0f moeda(s) de R$ 0.50\n", m50);
    System.out.printf("%.0f moeda(s) de R$ 0.25\n", m25);
    System.out.printf("%.0f moeda(s) de R$ 0.10\n", m10);
    System.out.printf("%.0f moeda(s) de R$ 0.05\n", m5);
    System.out.printf("%.0f moeda(s) de R$ 0.01\n", m1);
    
    
    
    
  }
}