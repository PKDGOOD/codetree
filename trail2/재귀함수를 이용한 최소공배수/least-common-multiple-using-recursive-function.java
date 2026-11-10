import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 모든 원소에 대해 최소공배수 탐색
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = lcm(result, arr[i]);
        }
        System.out.print(result);
    }

    // 최대공약수 - 유클리드 호제법 (재귀버전)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // 최소공배수 공식적용 a*b / gcd (*,/ 간 계산 순서차이는 없으므로 나눗셈 먼저하면 오버플로우 방지가능)
    public static int lcm(int a, int b) {
        return a/gcd(a,b) * b;
    }

}