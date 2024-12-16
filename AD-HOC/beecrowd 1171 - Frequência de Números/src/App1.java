import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++){
            int c = sc.nextInt();

            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key + " aparece " + map.get(key) + " vez(es)");
        }
        sc.close();
    }
}
