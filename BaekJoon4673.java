import java.util.Scanner;

public class BaekJoon4673 {    
    public static void main(String[] args) {
        int n = 22345;
        
        while(true){
            // System.out.println(n);
            if(n > 10){
                System.out.println(n % 10);
                n = n / 10;
            } else
            break;
        }
    }
}