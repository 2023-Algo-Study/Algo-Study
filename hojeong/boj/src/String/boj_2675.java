import java.io.*;
import java.util.StringTokenizer;

public class boj_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String s = br.readLine(); // 반복횟수, 문자열 입력
            StringTokenizer st = new StringTokenizer(s); 
            int R = Integer.parseInt(st.nextToken()); // 반복횟수
            String S = st.nextToken(); // 문자열
            String array[] = S.split("");

            String P = "";
            for (int j=0; j<array.length; j++) {
                for (int k=0; k<R; k++) {
                    P = new StringBuilder(P).append(array[j]).toString();
                }
            }
            System.out.println(P);
        }
    }
}
