import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon11399 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = n;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            list.add(sc.nextInt());
        }
        sc.close();
        
        list.sort(Integer::compareTo);

        for(int i = 0 ; i < k ; i++){
            sum += list.get(i) * n;
            n--;
        }
        System.out.println(sum);
    }
}
