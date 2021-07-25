import java.util.Scanner;

public class BaekJoon2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
       
        for(int i = 0 ; i < 10 ; i++){
            int result = a * b * c;
            int count = 0;
        while(result >= 1){
            if(result % 10 == i){
                count++;     
            }
            result = result / 10;
        }
        System.out.println(count);
        }
    }
}
