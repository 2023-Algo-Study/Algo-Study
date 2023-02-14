import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2775 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[15][15]; // k,n <= 14 조건 주의
        // 0층 초기화, 1호 초기화
        for(int i = 0; i < 15; i++) {
            arr[i][1] = 1;	// 1호 초기화 (i층 1호)
            arr[0][i] = i;	// 0층 초기화 (0층 i호)
        }

        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j]; // 문제의 핵심. i층 j호는 i층 j-1호 + i-1층 j호의 합.
            }
        }

        
        int T = Integer.parseInt(br.readLine());
        for (int l=0; l<T; l++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(arr[k][n]);
        }
    }
}
