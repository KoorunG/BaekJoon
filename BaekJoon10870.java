import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10870 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getFibonachi(n));
    }
    private static int getFibonachi(int n){
        if (n == 0)
        return 0;
        else if (n == 1)
        return 1;
        else{
            n = getFibonachi(n - 2) + getFibonachi(n - 1);
            return n;
        }
    }
}

