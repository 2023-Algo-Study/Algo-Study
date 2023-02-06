import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String array[] = s.split("");

        int alpha[] = new int[26];
        for (int i=0; i<alpha.length; i++) {
            alpha[i] = -1; // 초기화
        }
        
        for (int i=0; i<array.length; i++) {
                // 소문자 97~122
                int index = array[i].charAt(0) - 97;
                if (alpha[index] == -1) { // 처음 등장하는 위치를 저장해야 함. 초기값 -1일 때만(처음 등장) 값을 넣어줌. 
                    alpha[index] = i;
                }
        }

        for (int i=0; i<alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
