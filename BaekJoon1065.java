import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. */

public class BaekJoon1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split("");
        List<Integer> list = new ArrayList<>();
        
        for(String ss : s1){
            list.add(Integer.parseInt(ss));
        }
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0 ; i < list.size()-1 ; i++){
            int k = list.get(i+1) - list.get(i);
            list2.add(k);
        }

        for(int i = 0 ; i < list2.size()-1; i++){
            if(list2.get(i+1) == list2.get(i)){
                
            }
        }
        sc.close();
    }
}
