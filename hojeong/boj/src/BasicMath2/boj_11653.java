import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11653 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 이거 안 써도 맞았다고 나옴. 써도 맞음. N이 1일 때 아무것도 출력하지 않는다고 했으므로 둘 다 맞는 듯
        // if (N == 1) {
        //     System.out.println();
        // }

        while (N > 1) {
            for (int i=2; i<=N; i++) { // N까지 (등호주의)
                if (N % i == 0) {
                    System.out.println(i);
                    N /= i;
                    break;
                }
            }
        }

    }
}
