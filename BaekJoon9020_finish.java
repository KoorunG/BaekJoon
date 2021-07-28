import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
[백준 9020번 - 골드바흐의 추측]

1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 
예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다. 

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.

각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
*/


public class BaekJoon9020_finish {
    public static void main(String[] args) throws IOException {

        // BufferedReader과 InputStreamReader로 입력값을 받고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 1. 입력값 t만큼 반복함
        for (int i = 0; i < t; i++) {

            // 2. 반복되는 만큼 num을 입력하여
            int num = Integer.parseInt(br.readLine());
            makePrime(num);

            List<Integer> list = new ArrayList<>();
            // 3. num의 입력값으로 인해 만들어지는 prime 배열을 for문을 돌려
            for (int k = 0; k < prime.length; k++) {
                    // 4. 둘 다 소수인 경우에 입력값과 그 값이 일치할 경우 두 값을 출력
                    // prime[k]가 소수라면, 조건을 만족하는 나머지 소수는 prime[num - k]로 구할 수 있다
                    if (prime[k] == false && prime[num - k] == false) {
                       list.add(k);
                    }
            }

            // 5. prime[] 배열은 boolean 배열이기 때문에 해당 인덱스의 값을 list에 넣고 반환하여 출력했다
            int o = list.get(list.size() /2);
            System.out.println((num - o) + " " + o);
        }
    }

    // 에라토스테네스의 체를 이용하여 소수에 대한 boolean 배열을 만듦
    // (true = 소수가 아님, false = 소수)
    private static boolean[] prime;

    private static void makePrime(int n) {
        prime = new boolean[n + 1];

        // 2 이하의 경우 판별할 필요도 없으므로 스킵
        if (n < 2) {
            return;
        }

        // 0과 1은 소수가 아니므로
        prime[0] = prime[1] = true;

        // 2부터 n의 제곱근까지 for문을 돌림
        for (int i = 2; i < Math.sqrt(n); i++) {

            // 이미 검사한 숫자는 스킵함
            if (prime[i] == true) {
                continue;
            }

            // 각 n에 대한 배수는 소수가 아니므로 true
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
