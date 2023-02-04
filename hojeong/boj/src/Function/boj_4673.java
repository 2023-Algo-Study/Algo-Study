public class boj_4673 {
    public static void main(String[] args) {
        // 셀프 넘버
        boolean[] flag = new boolean[10001];

        for (int i=1; i<10001; i++) {
            int n = selfNumber(i); // n 의 생성자가 i -> n은 셀프 넘버가 아님

            if (n < 10001) {
                flag[n] = true; // -> true 로 바꿈
            }
        }

        for (int i=1; i<10001; i++) {
            if(!flag[i]) { // flase 인 인덱스만 출력
                System.out.println(i);
            }
        }
    }

    // number로 연산 후 합 리턴. (합의 생성자가 number)
    public static int selfNumber(int number) {
        int sum = number; // number 자체도 더해야 함
        
        while (number != 0) {
            sum += (number % 10); // 일의 자리 수 더하고
            number /= 10; // 자리 수 하나 줄임
        }

        return sum;
    }
}
