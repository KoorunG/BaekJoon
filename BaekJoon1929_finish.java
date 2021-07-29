import java.io.IOException;
import java.util.Scanner;

public class BaekJoon1929_finish {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        makePrime(n);
        for(int i = m ; i <= n ; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
        sc.close();
    }
    private static boolean[] prime;
    private static void makePrime(int n){
        prime = new boolean[1000001];

        if(n < 2){
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2 ; i < Math.sqrt(1000000); i++){
            if(prime[i] == true){
                continue;
            }
            for(int j = i * i ; j < 1000000 ; j += i){
                prime[j] = true;
            }
            
        }
    }
}