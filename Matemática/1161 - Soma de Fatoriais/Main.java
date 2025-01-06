import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String st = sc.nextLine();
            String[] vetor = st.split(" ");
            
            Long v1 = Long.parseLong(vetor[0]);
            v1 = fatorial(v1);
            
            Long v2 = Long.parseLong(vetor[1]);
            v2 = fatorial(v2);
            
            System.out.println(v1 + v2);
        }
    }
    
    public static Long fatorial(Long n) {
        Long resultado = 1L;
        for (Long i = 1L; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}