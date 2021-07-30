import java.util.Scanner;

public class BaekJoon4948_finish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        int n = sc.nextInt();
        if(n == 0){
            break;
        }
        makePrime(n);
        int count = 0;
        for(int i = n + 1 ; i <= 2*n ; i++){
            if(prime[i] == false){
                count++;
            }
        }
        System.out.println(count);
    }
    sc.close();

    }

    private static boolean[] prime;
    private static void makePrime(int n){
        prime = new boolean[n*2 + 1];
        prime[0] = prime[1] = true;
        if(n < 2){
            return;
        }
        for(int i = 2 ; i <= Math.sqrt(prime.length) ; i++){
            if(prime[i] == true){
                continue;
            }

            for(int j = i * i ; j < prime.length ; j += i){
                prime[j] = true;
            }
        }
    }
}
