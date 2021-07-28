import java.util.Scanner;

/*[백준 11047번 - 동전 0]
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.*/

public class BaekJoon11047_finish {
 
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

