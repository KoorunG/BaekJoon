import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BaekJoon18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        // LinkedList : Queue를 구현하고 있는 List
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n ; i++){
            StringBuilder sb = new StringBuilder(); 
            String str = br.readLine();

            // push 
            if(str.contains("push")){
                String[] a = str.split(" ");
                list.add(Integer.parseInt(a[1]));
            }

            switch(str){
                case "pop" :
                Integer pop = list.poll();
                if(pop == null)
                sb.append(-1).append('\n');
                else
                    sb.append(pop).append('\n');
                
                break;

                case "size" :
                sb.append(list.size()).append('\n');
                break;

                case "empty" :
                if(list.isEmpty())
                sb.append(1).append('\n');
                else
                    sb.append(0).append('\n');
                break;

                case "front" :
                Integer front = list.peek();
                if(front == null)
                sb.append(-1).append('\n');
                else
                    sb.append(front).append('\n');
                break;

                case "back" :
                Integer back = list.peekLast();
                if(back == null)
                sb.append(-1).append('\n');
                else
                    sb.append(back).append('\n');
            }
            System.out.print(sb);
        }
        br.close();
    }
    
}
