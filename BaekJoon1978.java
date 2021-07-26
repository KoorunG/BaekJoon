import java.util.Scanner;

public class BaekJoon1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < a ; i++){
            int b = sc.nextInt();
            if(check(b) == true)
                count++;
        }
        System.out.println(count);
        sc.close();
    }

    private static boolean check(int n){
        // 소수 : 1과 자기자신으로밖에 나눌 수 없는 수
        // for문으로 2 ~ N-1로 나누어 나머지가 0이 되지 않으면 소수!
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
