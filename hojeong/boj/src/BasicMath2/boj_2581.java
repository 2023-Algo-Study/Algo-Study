import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2581 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = 0;
        boolean isPrime = true;
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i=M; i<=N; i++) {
            isPrime = true;
            if (i == 1) { // 소수 판별에서 1은 소수가 아닌 거 꼭 걸러주기
                continue;
            }

            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (sum == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
