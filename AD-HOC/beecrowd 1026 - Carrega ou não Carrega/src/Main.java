import java.io.IOException;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            
            String[] entradas = linha.split(" ");
            long a = Integer.parseInt(entradas[0]);
            long b = Integer.parseInt(entradas[1]);
            
            long result = a ^ b;
            
            System.out.println(result);
        } 
        sc.close();
    } 
}