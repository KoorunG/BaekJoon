import java.util.Scanner;

public class BaekJoon11054 {
    public static void main(String[] args) {

        // 배열 세팅
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int[] array = new int[repeat];
        for(int i = 0 ; i < repeat ; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        // 바이토닉 수열
        // 배열에서 int max 하나 선택
        // 그 수를 기준으로 왼쪽은 작은 수, 오른쪽은 큰 수 뽑음
        // 합침

        
    }
}
