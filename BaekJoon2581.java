import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = m ; i <= n ; i++){
            if(check(i)){
                list.add(i);
                count++;
            }
        }
        if(count == 0){
        System.out.println(-1);
        } else {
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(Integer::min).get());
        }
        
    }

    private static boolean check(int n){
        if (n == 1){
            return false;
        }
        for(int i = 2 ; i <= n -1 ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
