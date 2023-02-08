import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");

        int[] alpha = new int[26];
        for (int i=0; i<alpha.length; i++) {
            alpha[i] = 0; // 초기화
        }

        for (int i=0; i<arr.length; i++) {
            char c = arr[i].charAt(0);
            alpha[c-65]++; // 나온 알파벳에 카운트
        }

        int sum = 0;
        for (int i=0; i<alpha.length; i++) {
            if (i < 3) {
                sum += alpha[i]*3;
            } else if (i < 6) {
                sum += alpha[i]*4;
            } else if (i < 9) {
                sum += alpha[i]*5;
            } else if (i < 12) {
                sum += alpha[i]*6;
            } else if (i < 15) {
                sum += alpha[i]*7;
            } else if (i < 19) {
                sum += alpha[i]*8;
            } else if (i < 22) {
                sum += alpha[i]*9;
            } else if (i < 26) {
                sum += alpha[i]*10;
            } 
        }

        System.out.println(sum);
    }
}
