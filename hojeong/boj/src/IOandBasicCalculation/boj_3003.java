import java.util.Scanner;

public class boj_3003 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8}; // 배열 선언과 동시에 초기화 

        for (int i=0; i<arr.length; i++) {
            int num = sc.nextInt();
            System.out.print(arr[i] - num + " ");
        }

        sc.close();
    }
}
