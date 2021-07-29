import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*[백준-1065번 한수]
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.*/

public class BaekJoon1065_finish {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int count = 0;

    // 1 ~ number 까지 for문을 돌려 check(i)를 만족하는 count를 세서 출력한다
    for(int i = 1 ; i <= number; i++){
        if(check(i)){
            count++;
        }    
    }
    System.out.println(count);
    sc.close();
    } 
    
    private static boolean check(int n){
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    // 1 ~ 9는 모두 한수로 처리한다
    if(n >= 1 && n <=9){
        return true;
    }
    
    // 자릿수를 쪼개 list 배열에 넣는다
    while(true){
        list.add(n % 10);
        n = n / 10;
        if(n < 1){
            break;
        }
    }
    
    // list2에 자릿수와 그 다음 자릿수를 뺀 값을 저장한다
    for(int i = 0; i < list.size() - 1; i++){
        int k = list.get(i+1) - list.get(i);
        list2.add(k);
    }
    
    // list를 스트림으로 처리하여 중복값을 제거한 후 갯수를 센다
    // 그 값이 1이라면 모두 같다는 뜻, 즉 등차수열이라는 의미이므로 true를 반환하고
    // 그 이외는 false를 반환한다
    if((list2.stream().distinct().count()) == 1){
        return true;
    } else {
        return false;
    }
    }
}
