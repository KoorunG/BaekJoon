import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int repeat = Integer.parseInt(br.readLine());
        int[] count = new int[repeat];
        for(int i = 0; i < repeat ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
        }

        // 입력값 -> 나이 + 이름 + (순번)
        // 비교값 -> 나이 , 순번
        
    }
}
