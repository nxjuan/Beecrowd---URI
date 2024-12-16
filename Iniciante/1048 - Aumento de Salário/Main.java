import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double p;
        double v2;
        if(v <= 400){
            p = 0.15;
            v2 = v + v * p;
        }else if(v <= 800){
            p = 0.12;
            v2 = v + v * p;
        }else if(v <= 1200){
            p = 0.1;
            v2 = v + v * p;
        }else if(v <= 2000){
            p = 0.07;
            v2 = v + v * p;
        }else {
            p = 0.04;
            v2 = v + v * p;
        }
        System.out.printf("Novo salario: %.2f\n", v2);
        System.out.printf("Reajuste ganho: %.2f\n", v2-v);
        System.out.printf("Em percentual: %.0f %%\n", p*100);
    }
}