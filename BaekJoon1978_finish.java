import java.util.Scanner;

/* 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오. */

public class BaekJoon1978_finish {
    public static void main(String[] args) {
        
        // 스캐너로 입력을 받음
        Scanner sc = new Scanner(System.in);

        // a = 입력값
        int a = sc.nextInt();

        // count = 0으로 초기화
        int count = 0;

        // for문으로 0 ~ a까지 돌림
        for(int i = 0 ; i < a ; i++){

            // 반복되는 동안 b를 입력받음
            int b = sc.nextInt();

            // check(n) == true라면 (즉, 소수라면)
            if(check(b) == true)

            // count를 1 증가시킴
                count++;
        }
        
        // count 출력
        System.out.println(count);
        sc.close();
    }

    // 소수인지 아닌지 여부를 체크하는 메소드를 만듦
    private static boolean check(int n){

        // 소수 : 1과 자기자신으로밖에 나눌 수 없는 수
        // for문으로 i를 2 ~ N-1까지 돌린 뒤, n을 i로 나누어 나머지가 0이 되지 않으면 소수!
        if(n == 1){
            return false;
        }
        
        for(int i = 2 ; i <= n - 1 ; i++){
            if(n % i == 0){
                return false;
            }     
        }
        return true;
    }
}   
