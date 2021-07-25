import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    }
}
