import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            String x = sc.nextLine();        
            Integer n1 = (int)x.charAt(0) - 48;

            if(x.length() > 1){
                Integer n2 = (int)x.charAt(2) - 48;
                if(n1 + n2 != 0){
                    System.out.println(n1 + n2);
                }else{
                    System.out.println("");
                }
            }
            else{
                Integer n2 = 0;
                if(n1 + n2 != 0){
                    System.out.println(n1 + n2);
                }else{
                    System.out.println("");
                }
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.print("");
        }
          
        
        sc.close();
    }
}
