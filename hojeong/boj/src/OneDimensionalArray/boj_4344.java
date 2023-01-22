package OneDimensionalArray;

import java.util.Scanner;

public class boj_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        for (int i=0; i<C; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int total = 0;
            for (int j=0; j<N; j++) {
                arr[j] = sc.nextInt(); // j for문인데 i로 씀.
                total += arr[j];
            }
            double avg = (double)total / N;
            int cnt = 0;
            for (int k=0; k<N; k++) {
                if (avg < arr[k]) {
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f", ((double)cnt/N)*100) + "%");
        }

        sc.close();
    }
}
