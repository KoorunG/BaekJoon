import java.util.Scanner;

public class BaekJoon1002_finish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
    
            int k1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            int d1 = (r2 + r1) * (r2 + r1);
            int d2 = (r2 - r1) * (r2 - r1);

            if(k1 == 0 && d2 == 0){
                System.out.println(-1);
            }

            else if(k1 > d1 || k1 < d2){
                System.out.println(0);
            }

            else if(k1 == d1 || k1 == d2){
                System.out.println(1);
            }

            else if(k1 < d1 || k1 > d2){
                System.out.println(2);
            }
        }
        sc.close();
    }
}
