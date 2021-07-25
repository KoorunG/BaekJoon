import java.util.Scanner;

public class BaekJoon10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getFactorial(sc.nextInt()));
        sc.close();
    }
    private static int getFactorial(int n) {
        if (n == 0)
            return 1;
        n = n * getFactorial(n - 1);
        return n;
    }
}
