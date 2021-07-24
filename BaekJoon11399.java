import java.util.Scanner;

public class BaekJoon11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = n;
        int[] times = new int[n];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            times[i] = sc.nextInt();
            sum += times[i] * n;
            n--;
        }
        System.out.println(sum);
        sc.close();                 // 시간 총합 구하기는 했는데
                                    // 총합의 최소값 구하기가...    
    }
}
