import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N+1]; // 0부터 시작하므로 +1, 초기값 false
        arr[0] = true; // 소수 아닌 것을 true
        arr[1] = true;

        // 제곱근 이용한 에라토스테네스의 체
        for (int i=2; i <= Math.sqrt(N); i++) {
            if (arr[i]) { // 이미 소수가 아니라고 걸러진 수는 건너뜀.
                continue;
            }

            // j=i*2 가 정석이지만, 이미 앞에서 2의 배수로 걸러졌을 거기 때문에 제곱수부터 해도 괜찮은 것
            for (int j=i*i; j<N + 1; j = j + i) { // j = j + i -> i의 배수가 걸러지는 것. + i, + i ...
                arr[j] = true; // 소수 아닌 것이 걸러지므로 true
            }
        }

        for (int i=M; i<=N; i++) {
            if (!arr[i]) {
                System.out.println(i); 
            }
        }
    }
}
