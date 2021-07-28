import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
// import java.util.Scanner;

public class BaekJoon2839_finish {
	public static void main(String[] args) throws IOException {
        // 입력값 받는 방법 

        // 1. Scanner
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
        // sc.close();

        // 2. BufferedReader과 InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count;
        br.close();

        // 가변배열 ArrayList를 만든다
        List<Integer> list = new ArrayList<>();
        try{

            // for문을 돌려서
            for(int i = 0 ; i <= n/3 ; i++){
                for(int j = 0; j <= n/5; j++){

                    // 조건에 맞는 i와 j를 찾는다
                    if(3 * i + 5 * j == n){

                        //i와 j를 더한것을 count로 저장하고 list에 등록한다
                        count = i + j;
                        list.add(count);
                    }
                }
            }

            // list에서 최소값을 스트림을 이용하여 찾은 후 출력한다
            System.out.println(list.stream().reduce(Integer::min).get());

            // 만족하는 i와 j가 없는 경우에 예외가 발생하는데 
            // try-catch를 이용하여 예외가 발생하면 -1을 출력한다
        } catch(NoSuchElementException e){
            System.out.println(-1);
        }
		
	}
}
