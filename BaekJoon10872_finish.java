import java.util.Scanner;

public class BaekJoon10872_finish {

    // 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getFactorial(sc.nextInt()));
        sc.close();
    }

    // 팩토리얼을 구하는 메소드
    private static int getFactorial(int n) {

        // 0!은 1이므로 따로 정의
        if (n == 0)
            return 1;

        // 팩토리얼의 정의대로 입력값에 getFactorial(n-1)을 재귀로 걸어준다
        n = n * getFactorial(n - 1);
        return n;
    }
}
