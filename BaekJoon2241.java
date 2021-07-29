import java.util.Scanner;

public class BaekJoon2241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = n;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        
    }
}
