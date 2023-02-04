public class boj_15596 {
    public static void main(String[] args) {
        
    }

    // 함수 정의하는 문제 
    // 합을 구해야 하는 정수 n개가 저장되어 있는 배열 a
    // 리턴값: a에 포함되어 있는 정수 n개의 합
    long sum(int[] a) {
        long sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
