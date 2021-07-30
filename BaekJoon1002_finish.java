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
    
            long distance = (long) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            long radius = (long)(r1 + r2);
            
            if(distance == 0 && r1 == r2)
            System.out.println(-1);
        
            else {
                if(distance > radius || (distance * distance < (r1 - r2) * (r1 - r2)))
                System.out.println(0);

                else if(distance == radius || (distance * distance == (r1 - r2) * (r1 - r2)))
                System.out.println(1);

                else if(distance < radius)
                System.out.println(2);
            }

        }
        sc.close();
        
    }
}
