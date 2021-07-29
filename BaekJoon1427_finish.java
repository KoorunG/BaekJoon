import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*[백준-1427번 소트인사이드]
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
*/
public class BaekJoon1427_finish {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int k = n % 10;
            n = n / 10;
            list.add(k);
        }
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
