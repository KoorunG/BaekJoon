
public class BaekJoon4673 {    
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];

        for(int i = 1 ; i <= 10000 ; i++){
            int n = d(i);
            if(n <= 10000){
                check[n] = true;
            }
        } 

        for(int i = 1 ; i <= 10000; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }
    }

    private static int d(int num){
        int sum = num;

        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}