import java.util.Locale;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);        
        Scanner sc = new Scanner(System.in);
        
        double media = 0.0;
        int qtdPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double n = sc.nextDouble();
            if (n >= 0) {
                media += n;
                qtdPositivos++;
            }
        }

        if (qtdPositivos > 0) {
            System.out.println(qtdPositivos + " valores positivos");
            System.out.printf("%.1f\n", media / qtdPositivos);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        sc.close();
    }
}
