package OneDimensionalArray;

import java.util.Scanner;

public class boj_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] r = new int[43]; // 나머지 0~42
        for (int i=0; i<r.length; i++) {
            r[i] = 0; // 초기값
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] % 42;
            r[arr[i]] = 1; // 서로 다른 나머지를 인덱스로 해 값 1로 변경
        }

        int cnt = 0;
        for (int i=0; i<r.length; i++) { // 나머지는 0부터 가능하므로 i=0 부터
            if (r[i] == 1) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
