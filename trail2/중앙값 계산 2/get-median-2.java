import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // 홀수일때
            if((i+1) % 2 == 1) {
                Arrays.sort(arr, 0, i+1); // 탐색 범위 내의 값들 오름차순 정렬
                int middleIndex = (i+1) / 2; // 중앙값 인덱스
                System.out.print(arr[middleIndex] + " ");
            }
        }
    }
}