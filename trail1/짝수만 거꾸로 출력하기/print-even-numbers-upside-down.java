import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // 역순 탐색
        for(int i=n-1; i>=0; i--) {
            if(arr[i] % 2 == 0) { // 조건 부합시 출력
                System.out.print(arr[i] + " ");
            }
        }
    }
}