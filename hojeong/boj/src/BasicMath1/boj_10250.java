import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int k=0; k<T; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            int cnt = 0;
            for (int i=1; i<=W; i++) { // 층수
                for (int j=1; j<=H; j++) { 
                    cnt++;
                    if (cnt == N) {
                        if (i < 10) {
                            System.out.println(j + "0" + i);
                        }
                        else {
                            System.out.println(j + "" + i); // 변수 연속 출력 (printf 쓸 수 있지만, 어차피 println 쓸 거니 "" 써서 구분하기 - 이거 안 쓰면 + 연산 결과가 출력됨)
                        }
                    }
                }
            }
        }

    }
}
