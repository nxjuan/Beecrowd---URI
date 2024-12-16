import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

       HashMap<Integer, String> map = new HashMap<>();
       map.put(61, "Brasilia");
       map.put(71, "Salvador");
       map.put(11, "Sao Paulo");
       map.put(21, "Rio de Janeiro");
       map.put(31, "Juiz de Fora");
       map.put(69, "Campinas");
       map.put(27, "Vitoria");
       map.put(31, "Belo Horizonte");
       Scanner sc = new Scanner(System.in);
       Integer val = sc.nextInt();
       System.out.println(map.get(val));

    }

}
