import java.util.Scanner;

/*
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳 변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
*/

public class BaekJoon2941_finish {
    public static void main(String[] args) {

        // 입력을 받고
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        // 문자열의 길이를 count로 지정한다
        int count = str.length();

        // 만일 크로아티아 알파벳에 해당할 경우 그만큼 count를 감소시킨다
        // 단 "dz=" 의 경우 "dž" 로 가는 과정에서 3글자가 1글자로 줄어드는 것이기 때문에 count를 2 감소시킨다
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

        // count 출력
        System.out.println(count);
        
    }
}


