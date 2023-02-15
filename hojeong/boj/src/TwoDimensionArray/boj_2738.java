import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 사용법. br.readLine()으로 한 줄 단위로 읽은 문자열이 인자로 들어오기 때문에 한 줄씩 읽을 때마다 써줘야 함.
            for (int j=0; j<M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " "); // StringTokenizer 사용법. 
            for (int j=0; j<M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " "); // 하드 코딩 주의
            }
            System.out.println();
        }
    }
}