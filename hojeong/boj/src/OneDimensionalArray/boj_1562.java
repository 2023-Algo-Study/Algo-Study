package OneDimensionalArray;

import java.util.Scanner;

public class boj_1562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int maxIdx = 0;

        for (int i=1; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println(max);
        System.out.println((maxIdx+1));
        sc.close();
    }
}
