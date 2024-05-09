import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    List<Integer> lista2 = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      list.add(sc.nextInt());
    }


    for(int i = 0; i < 3; i++){
      lista2.add(list.get(i)); 
    }

    for(int i = 0; i < 3; i++){
      for(int j = i + 1; j < 3; j++){
        if(list.get(i) > list.get(j)){
          int aux = list.get(i);
          list.set(i, list.get(j));
          list.set(j, aux);
        }
      }
    }  

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }

    System.out.println();

    for(int j = 0; j < lista2.size(); j++){
      System.out.println(lista2.get(j));
    }
  }
}