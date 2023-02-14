import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9020 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[10001]; // 10000 까지. N+1, N, N+1 기억하기
        arr[0] = true;
        arr[1] = true;
        for (int i=2; i<=Math.sqrt(10000); i++) {
            if (arr[i]) {
                continue;
            }

            for (int j=i*i; j<10001; j=j+i) {
                arr[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());
        int n = 0;
        for (int i=0; i<T; i++) {
            n = Integer.parseInt(br.readLine()); 

            for (int j=n/2; j<n; j++) { // 파티션이 여러 개 존재 -> 두 소수 차이가 가장 적은 거 출력. 어케하지? -> 몫을 반으로 나눈 값부터.
                if (!arr[j]) {
                    if (!arr[n - j]) {
                        System.out.println((n-j) + " " + j);
                        break;
                    }
                }
            }
        }
    }
}
