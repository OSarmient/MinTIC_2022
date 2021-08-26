import java.util.Scanner;

public class Ciclo2 {

    public static void main (String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        
        int H = P * 2 + 4;
        
        int L = (P + H)/5;


        System.out.println(P + " " + H + " " + L);

        if(0 < L && L < 20){    
            System.out.print("uno");
        }else if(21 < L && L < 30){
            System.out.print("dos");
        }else if(31 < L && L < 50){
            System.out.print("tres");
        }else{
            System.out.print("cuatro");
        }
        
            
    } 

}