import java.util.Scanner;

public class BaekJoon1065 {
    public static void main(String[] args) {
        
        // int형으로 각 자릿수 합 구하기 ex) 156 -> 1 + 5 + 6 = 12

        System.out.println(256/100);

        while(true){
            int n = 12345;
            int count = 0;
            System.out.println(n);
            if(n > 10){
                n = n / 10;
                System.out.println(n % 10);
            } else
                break;
        }
    }
}
