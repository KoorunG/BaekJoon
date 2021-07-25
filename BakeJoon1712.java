import java.util.Scanner;

public class BakeJoon1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixed = sc.nextInt();
        int variable = sc.nextInt();
        int price = sc.nextInt();
        sc.close();
        if(variable >= price){
            System.out.println(-1);
        }
        else {
            System.out.println(fixed / (price - variable) + 1);
        }
    }

}
