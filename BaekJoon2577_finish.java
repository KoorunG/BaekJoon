import java.util.Scanner;

/* 
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 
번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다. 
*/

public class BaekJoon2577_finish {
    public static void main(String[] args) {
        
        // 세 수 a, b, c를 차례로 입력받음
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        
        // i를 0 ~ 9까지 반복문을 돌린다
        for(int i = 0 ; i < 10 ; i++){

            // result를 선언해줌 (a x b x c)
            int result = a * b * c;

            // count를 0으로 초기화
            int count = 0;
        
            // result가 0이 이상인 동안
        while(result > 0){
            
            // result를 10으로 나눈 나머지가 i라면 count를 1씩 증가시킨다
            // 따라서 나머지가 i일때 count를 출력할 수 있게됨
            if(result % 10 == i){
                count++;     
            }

            // 다음 자릿수를 구하기 위해 result = result / 10으로 설정
            result = result / 10;
        }

        // count를 출력한다 (for문 안에 있기 때문에 자릿수가 0 ~ 9인 경우의 개수가 모두 출력됨)
        System.out.println(count);
        }
    }
}
