package OneDimensionalArray;

import java.util.Scanner;

public class boj_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] score = new double[N];
        score[0] = sc.nextDouble();
        double max = score[0];
        for (int i=1; i<score.length; i++) {
            score[i] = sc.nextDouble();
            if (max < score[i]) {
                max = score[i];
            }
        }

        double sum = 0;
        for (int i=0; i<score.length; i++) {
            score[i] = (score[i]/max * 100);
            sum += score[i];
        }

        System.out.println(sum/N);
        sc.close();
    }
}
