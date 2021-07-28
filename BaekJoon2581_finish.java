import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 
이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 
61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
*/
public class BaekJoon2581_finish {
    public static void main(String[] args) throws IOException {

        // BufferedReader, InputStreamReader을 이용하여 입력을 받아봄
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // m과 n을 차례로 입력 받는다
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        // count = 0으로 초기화
        int count = 0;

        // Integer 배열을 만들어서 check()를 이용하여 true이면
        // 소수인 숫자를 배열에 넣고 count를 1씩 증가시킨다
        List<Integer> list = new ArrayList<>();
        for(int i = m ; i <= n ; i++){
            if(check(i)){
                list.add(i);
                count++;
            }
        }
        // 소수가 없으면 -1을 출력해야 하므로 조건을 따로 걸어주었다
        if(count == 0){
        System.out.println(-1);
        } else {
        
        // 소수가 존재하면 list의 스트림을 이용하여 합계와 최솟값을 구한다.
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(Integer::min).get());
        }
        
    }

    // 소수 여부를 판별하는 메소드
    private static boolean check(int n){
        if (n == 1){
            return false;
        }
        for(int i = 2 ; i <= n -1 ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
