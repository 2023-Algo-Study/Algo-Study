package OneDimensionalArray;

import java.util.Scanner;

public class boj_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            else if (min > arr[i]) { // else 로 퉁치지 말고 최소 조건도 명시적으로 작성하기
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}
