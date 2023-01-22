package OneDimensionalArray;

import java.util.Scanner;

public class boj_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[28];
        int[] stu = new int[31]; // 1~30
        for (int i=0; i<stu.length; i++) {
            stu[i] = 0;
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            stu[arr[i]] = 1; // 인덱스 주의. arr[i]+1 아님.
        }

        for (int i=1; i<stu.length; i++) {
            if (stu[i] == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
