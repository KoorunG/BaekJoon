import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon9020 {
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
            // 3. num의 입력값으로 인해 만들어지는 prime 배열을 for문을 두번 돌려
            for (int k = 0; k < prime.length; k++) {
                for (int j = 0; j < prime.length; j++) {
                    
                    // 4. 둘 다 소수인 경우에 입력값과 그 값이 일치할 경우 두 값을 출력
                    if (prime[k] == false && prime[j] == false) {
                        // 5. 골드바흐의 추측이 맞을 경우에 list에 요소를 추가한다
                        // (어차피 k와 j는 값이 겹치므로 한쪽만 넣음)
                        if (num == k + j){
                            list.add(k);
                            
                        }
                    }
                }
            }
            // 6-1 배열의 크기가 홀수일 경우, 중간값을 두번 출력한다
            if(list.size() % 2 == 1){
                System.out.println(list.get(list.size() / 2 ) + " " + list.get(list.size() / 2 ));
            // 6-2 배열의 크기가 짝수일 경우, 가운데에 있는 값 두개를 출력한다     
            } else {
                System.out.println(list.get(list.size() / 2 - 1 ) + " " + list.get(list.size() / 2));
            }
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
