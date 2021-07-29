import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }
        // System.out.println(list);

        // 블랙잭 - 세 수의 합이 max에 '가장 가깝도록'
        for(int i = n ; i > 0 ; i--){
            int a = list.remove(i - 1);
            for(int j = n  ; j > 0 ; j--){
                int b = list.remove(j - 1);
                for(int k = n ; k > 0 ; k--){
                    int c = list.remove(k - 1);
                    if(a + b + c == max){
                        System.out.println(a + b + c);
                    }
                }
            }
        }
    }
}
