
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2581_1_finish {

    // 소수를 구하는 매커니즘 : 에라토스테네스의 체
    /* 
    n 이하의 소수를 구하는 법 :
    2부터 √n까지 자연수 k를 제외한 k의 배수들을 반복하여 제거한다
    
    유용한 매커니즘이니 외워두자!
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        makePrime(a);
        for(int i = 0 ; i < prime.length; i++){
            if(prime[i] == false){
                System.out.println(i);
            }
        }
    }
    private static boolean[] prime; // boolean[] 자료형의 배열 선언
    private static void makePrime(int n){   // '소수가 아닌' 배열을 만드는 메소드

        prime = new boolean[n + 1]; // boolean[] 배열인 prime 생성 (0부터 N까지 담을것이기 때문에 n+1로 만듦)

        if(n == 1){  // 1은 판별할 필요도 없으므로 넘어감
            return;
        }

        prime[0] = prime[1] = true; // 0과 1은 소수가 아니므로 true

        for(int i = 2 ; i <= Math.sqrt(n); i++){    // i를 2에서 √n까지 돌림
            if(prime[i] == true){                   // 이미 체크된 배열이면 다음 반복문으로 스킵
                continue;
            }
            for(int j = i * i ; j < prime.length ; j += i){ // i의 배수들을 거르기 위한 반복문
                                                            // i * i 부터 시작하는 이유 : i*2, i*3, i*4 .... i*(i-1)은 이미 모두 어떤 수들의 배수이기 때문에
                                                            // 굳이 체크를 안해도 된다 (원래 정의대로 i*2에서부터 시작한다고 해도 i*3 i*4 ... i*(i-1)이기 때문에)
                                                            // i * i 부터 시작하는것과 모두 중복됨!!
                                                            // 예를들어 i가 3이면? j = 9부터 시작하여(3의 배수인 6은 이미 i = 2일때 걸러졌다, 다른 경우도 마찬가지)
                                                            // j += i 이므로 다음 반복문에서 j = 12가 된다! (즉, 3의 배수...)
                                                            // 즉, i의 배수를 반복하는 매커니즘이 되는 것이다
                prime[j] = true;
            }
        }
    }
}
