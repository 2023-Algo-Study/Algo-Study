import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int column = 0;
        int row = 0;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    column = i+1;
                    row = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(column + " " + row);
    }
}
