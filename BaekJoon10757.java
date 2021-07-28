import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        a = sba.reverse().toString();
        b = sbb.reverse().toString();
        String[] arra = a.split("");
        String[] arrb = b.split("");

        for(int i = 0 ; i < arra.length ; i++){
            int x = Integer.parseInt(arra[i]);
            int y = Integer.parseInt(arrb[i]);
            if (x + y > 9){
                System.out.print(x + y - 10);
            } else
            System.out.print(x + y);
        }
    }
}
