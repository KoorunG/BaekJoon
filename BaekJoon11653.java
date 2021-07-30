import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon11653 {
    public static void main(String[] args) throws IOException {

        // 입력 받는 부분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        // 소수 만들기
        makePrime(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (prime[i] == false) {
                primes.add(i);
            }
        }
        
        // 소인수 만들기
        List<Integer> list2 = new ArrayList<>();
        while(true){
            for (int j = 0; j < primes.size(); j++) {
                if (n % primes.get(j) == 0) {
                    // list2.add(primes.get(j));
                    System.out.println(primes.get(j));
                    n = n / primes.get(j);
                }
            }

            if(primes.contains(n)){
                System.out.println(n);
                break;
            }
        }

        // 소인수 출력
        list2.stream().sorted().forEach(System.out::println);
        
        
    }


    // 소수 만드는 매커니즘
    private static boolean[] prime;

    private static void makePrime(int n) {
        prime = new boolean[n];

        prime[0] = prime[1] = true;

        if (n < 2) {
            return;
        }

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i] == true) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}