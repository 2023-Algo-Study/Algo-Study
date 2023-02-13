import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1978 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int flag = 1;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i=0; i<N; i++) { // while(st.hasTokens()) 써도 됨
            int num = Integer.parseInt(st.nextToken());
            flag = 1;
            for (int j=2; j<num; j++) {
                if (num % j == 0) {
                    flag = 0; // boolean 값으로 써도 됨
                    break;
                }
            }
            if (flag == 1 && num != 1) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}