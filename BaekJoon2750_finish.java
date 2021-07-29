import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon2750_finish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }
        list.stream().sorted().forEach(System.out::println);
    }
}
