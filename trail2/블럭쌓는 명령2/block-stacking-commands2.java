import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A-1; j < B; j++) {
                arr[j] = arr[j] + 1;
            }
        }

        int result = 0;
        for (int x : arr) {
            if(x > result) result = x;
        }
        
        System.out.print(result);
    }
}