import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_4948 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1 <= n <= 123,456
        boolean[] arr = new boolean[123456*2 + 1]; // false 초기값, Boolean 아니고 boolean 임.
        arr[0] = true;
        arr[1] = true; // 소수 아닌 값 true

        for (int i=2; i <= Math.sqrt(123456*2); i++) {
            if (arr[i]) {
                continue;
            } // 이미 소수 아닌 값으로 판별됐으면 다음 반복문으로.

            for (int j = i*i; j < 123456*2 + 1; j = j + i) { // j 조건 주의. j = j + i -> i의 배수가 걸러지는 것. + i, + i ...
                arr[j] = true;
            }
        }

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n != 0) {
            cnt = 0;
            for (int i=n+1; i<=2 * n; i++) {
                if (!arr[i]) {
                    cnt++;
                }
            }

            System.out.println(cnt);

            n = Integer.parseInt(br.readLine());
        }
    }
}
