import java.util.Scanner;
 
public class BaekJoon11047 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		// N과 K 입력
		int N = in.nextInt();
		int K = in.nextInt();
		
		// N만큼 coin 배열 만들기
		int[] coin = new int[N];
		
		// 코인 가치 입력
		for(int i = 0; i < N; i++) {
			coin[i] = in.nextInt();
		}
		// 입력 종료
		in.close();

		// 카운트 초기화 (동전 개수의 총합)
		int count = 0;
		
		// i = 9에서 출발하여 i = 0까지 (동전의 가치를 오름차순으로 입력하므로)
		for(int i = N - 1; i >= 0; i--) {
 
			// 현재 동전의 가치가 입력한 K보다 작다면
			if(coin[i] <= K) {

				// K를 현재 동전의 가치로 나눈값을 count에 더해줌
				count += (K / coin[i]);

				// K = K를 가치로 나눈 나머지값
				K = K % coin[i];
			}
		}

		// 카운트 출력
		System.out.println(count);
	}
 
}

