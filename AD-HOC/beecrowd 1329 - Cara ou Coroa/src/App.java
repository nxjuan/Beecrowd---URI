import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 1;

        List<List<Integer>> list = new ArrayList<>();        

        do{
            List<Integer> lista = new ArrayList<>();

            n = sc.nextInt();           
            if(n != 0){
                for(int i = 0; i < n; i++){                
                lista.add(sc.nextInt());
                }
                list.add(lista);
            }            

        }while(n != 0);

        for(List<Integer> externa : list){

            int joao = 0;
            int maria = 0;
            for(Integer interna : externa){
                if(interna == 0){
                    maria++;
                }else{
                    joao++;
                }
            }

            System.out.println("Mary won " + maria + " times and John won " + joao + " times");           
        }
        
        sc.close();
    }
}
