import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        makePrime(n);
        for(int i = m ; i <= n ; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
        br.close();
    }

    private static boolean[] prime;
    private static void makePrime(int n){
        prime = new boolean[n + 1];

        if(n < 2){
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2 ; i < Math.sqrt(n); i++){
            if(prime[i] == true){
                continue;
            }
            for(int j = i * i ; j <prime.length; j += i){
                prime[j] = true;
            }
            
        }
    }
}
