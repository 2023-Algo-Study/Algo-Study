import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int j=0; j<N; j++) {
            String str = br.readLine();
            String[] s = str.split("");
    
            int[] alpha = new int[26];
            for (int i=0; i<alpha.length; i++) {
                alpha[i] = 0;
            }
            
            char c = '?'; // 이전 문자 저장 변수. 일단 초기화. 
            int flag = 1; // 주의
            for (int i=0; i<s.length; i++) {
                if (s[i].charAt(0) == c) { // 이전 문자와 같으면 통과
                    continue; 
                } 
                c = s[i].charAt(0); // 갱신
                if (alpha[c-97] != 0) {
                    flag = 0; // 끝
                    break;
                } 
                alpha[c-97] = 1; // 나왔던 알파벳 해당 값 1로 바꿔줌.
            }

            if (flag == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
