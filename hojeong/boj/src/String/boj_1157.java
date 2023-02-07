import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class boj_1157 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자바에 소문자, 대문자 변환, 정렬, HashMap 있음. 다시 풀어보자

        // 1.
        // char[] array = br.readLine().toUpperCase().toCharArray();
        // int[] alpha = new int[26];

        // for (int i=0; i<array.length; i++) {
        //     int index = array[i] - 'A'; // -65와 같음
        //     alpha[index]++;
        // }

        // int max = Arrays.stream(alpha).max().getAsInt();
        // ArrayList<Character> list = new ArrayList<>();
        // for (int i=0; i<alpha.length; i++) {
        //     if (alpha[i] == max) {
        //         list.add((char)('A' + i));
        //     }
        // }
        
        // if (list.size() > 1) {
        //     System.out.println("?");
        // } else {
        //     System.out.println(list.get(0));
        // }
    

        String s = br.readLine().toUpperCase(); 
        String[] array = s.split("");
        // array 안 만들고 s.charAt(i) 이렇게 해도 동일함
        
        int alpha[] = new int[26];
        for (int i=0; i<alpha.length; i++) {
            alpha[i] = 0; // 초기화
        }

        for (int i=0; i<array.length; i++) {
            // 대문자 65~90, 소문자 97~122
            char C = array[i].charAt(0); // 이 두 줄 주의. NumberFormatException 발생했었음.
            // int index = C; // 바로 C 대입해도 됨
            alpha[C-65]++;
        }

        int max = -1;
        char c = '?';
        for (int i=0; i<alpha.length; i++) {
            if (max < alpha[i]) {
                max = alpha[i];
                c = (char) (i + 65);
            } else if (max == alpha[i]) {
                c = '?';
                // System.out.println("?");
                // return;
                // 대박 문제 해결이 이렇게 됨. 맞다.. 나는 같은 값이 나오면 ? 출력 후 바로 끝나게 짰는데 일단 출력할 문자를 ? 로 바꿔두고 더 큰 값이 나오면 또 그 문자를 저장하면 됐음.
            }
        }
        // 문제를 아라따 !!!
        // 만약 2개 값이 2개씩 나오고 1개가 3개 나오면 1개가 출력되어야 하는데 그냥 앞에서 걸러버렸어 바부.ㅜㅜ
        // 내일 할겡
        // JHxXTLKkx
        
        System.out.println(c);

    }
}
