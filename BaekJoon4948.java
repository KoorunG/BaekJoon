import java.util.Scanner;

public class BaekJoon4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        int n = sc.nextInt();
        if(n == 0){
            break;
        }
        makePrime(n);
        int count = 0;
        for(int i = 0 ; i <= 2 ; i++){
            if(prime[i] == false){
                // count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
    sc.close();

    }

    private static boolean[] prime;
    private static void makePrime(int n){
        prime = new boolean[123457];
        prime[0] = prime[1] = true;
        if(n < 2){
            return;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(prime[i] == true){
                continue;
            }

            for(int j = i * i ; j < prime.length ; j += i){
                prime[j] = true;
            }
        }
    }
}
