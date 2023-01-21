package Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_15552 {
    public static void main(String[] args) throws IOException {
        // 10950 - Scanner 사용
        // Scanner sc = new Scanner(System.in);

        // int T = sc.nextInt();
        // for(int i=0; i<T; i++) {
        //     int A = sc.nextInt();
        //     int B = sc.nextInt();
        //     System.out.println(A + B);
        // }
        // sc.close();

        // 15552 - BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.pareseInt(br.readLine());

        StringTokenizer st;
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.pareseInt(st.nextToken()) + Integer.pareseInt(st.nextToken())) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
