import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] s = str.split("");

        int cnt = 0;
        for (int i=0; i<s.length; i++) {
            if (s[i].equals("c") && i<s.length-1) { // ArrayIndexOutOfBounds 런타임 에러 주의
                if (s[i+1].equals("=") || s[i+1].equals("-")) {
                    i++;
                } 
                cnt++; // c 단독일 때도 카운팅 되어야 함(중첩 if문 밖에 있어야 함. 위치 주의)
            } else if (s[i].equals("d") && i<s.length-1) {
                if (s[i+1].equals("-")) {
                    i++;
                } else if (i<s.length-2 && (s[i+1].equals("z")) && s[i+2].equals("=")) {
                    i += 2;
                }
                cnt++; // d 단독일 때도 카운팅 되어야 함(중첩 if문 밖에 있어야 함. 위치 주의)
            } else if (i<s.length-1 && s[i].equals("l") && s[i+1].equals("j")) {
                i++;
                cnt++;
            } else if (i<s.length-1 && s[i].equals("n") && s[i+1].equals("j")) {
                i++;
                cnt++;
            } else if (i<s.length-1 && s[i].equals("s") && s[i+1].equals("=")) {
                i++;
                cnt++;
            } else if (i<s.length-1 && s[i].equals("z") && s[i+1].equals("=")) {
                i++;
                cnt++;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
