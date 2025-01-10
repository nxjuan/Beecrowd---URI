import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        String[] words = new String[3];
        for(int i = 0; i < 3; i++){
            words[i] = sc.nextLine();
        }
        if(words[0].equals("vertebrado") ){
            if(words[1].equals("ave")){
                if(words[2].equals("carnivoro")){
                    System.out.println("aguia");
                }else if(words[2].equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(words[1].equals("mamifero")){
                if(words[2].equals("onivoro")){
                    System.out.println("homem");
                }else if(words[2].equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(words[0].equals("invertebrado")){
            if(words[1].equals("inseto")){
                if(words[2].equals("hematofago")){
                    System.out.println("pulga");
                }else if(words[2].equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(words[1].equals("anelideo")){
                if(words[2].equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(words[2].equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
 
    }
 
}