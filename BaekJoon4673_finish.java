
public class BaekJoon4673_finish {
    /*
     * 셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를
     * 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
     * 
     * 양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수
     * 있다.
     * 
     * 예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51
     * + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
     * 
     * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
     * 
     * n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한
     * 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
     * 
     * 생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42,
     * 53, 64, 75, 86, 97
     * 
     * 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {

        // 0부터 1만까지 boolean[] 배열 check 선언, 따라서 10001 크기만큼의 배열을 선언함
        // (여기서 boolean[0] = 0의 boolean값이기 때문에 판단하기 편함)
        boolean[] check = new boolean[10001];

        // 1에서 1만까지 돌면서
        for (int i = 1; i <= 10000; i++) {

            // n은 d(i)를 만족하는 값이다 (즉 셀프넘버가 아닌 값이다)
            int n = d(i);

            // 1만 이하의 셀프넘버를 판별하는 것이기 때문에 1만 이하를 만족하는 n만 구하면 된다
            if (n <= 10000) {
                check[n] = true;
            }
        }

        // 여기서는 셀프넘버를 구해야 하기 때문에 !check[i]를 출력한다
        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }
    
    // 함수 d를 정의한다.
    private static int d(int num) {

        // sum을 입력값 num으로 초기화한다
        int sum = num;
        
        // 자릿수를 구하는 매커니즘
        // (입력값을 10으로 나눠가면서 그 나머지는 각 자릿수가 되기 때문에)
        while (num != 0) {

            // 자릿수를 sum에 더해주고 num을 10으로 계속 나눈 뒤 sum을 리턴한다
            sum += num % 10;
            num = num / 10;
        }

        // sum을 입력값으로 초기화 했기 때문에,
        // 결국 sum = 입력값 + 입력값의 각 자릿수가 되어 조건을 만족한다
        return sum;
    }
}