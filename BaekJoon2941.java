import java.util.Scanner;

public class BaekJoon2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int count = str.length();
        while(str.contains("dz=")){
            str = str.replaceFirst("dz=","dž");
            count -= 2;
        }
        while(str.contains("z=")){
                str = str.replaceFirst("z=","ž");
                count--;
        }
        while(str.contains("c=")){
            str = str.replaceFirst("c=","č");
            count--;
        }
        while(str.contains("c-")){
            str = str.replaceFirst("c-","ć");
            count--;
        }
        while(str.contains("d-")){
            str = str.replaceFirst("d-","đ");
            count--;
        }
        while(str.contains("lj")){
            str = str.replaceFirst("lj","ㅎ");
            count--;
        }
        while(str.contains("nj")){
            str = str.replaceFirst("nj","ㅋ");
            count--;
        }
        while(str.contains("s=")){
            str = str.replaceFirst("s=","š");
            count--;
        }
        System.out.println(count);
        
    }
}


