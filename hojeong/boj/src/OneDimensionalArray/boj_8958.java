package OneDimensionalArray;

import java.util.Scanner;

public class boj_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int sum = 0;
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i=0; i<n; i++) {
            total = 0;
            sum = 0;
            arr[i] = sc.next(); // nextLine으로 하면 컴파일 에러나고 입력 개수대로 입력 안 됨.
            String[] str = arr[i].split("");
            for (String s : str) {
                if (s.equals("O")) {
                    sum += 1;
                    total += sum;
                } else if (s.equals("X")) {
                    sum = 0;
                }
            }
            System.out.println(total);
        }

        sc.close();
    }
}
