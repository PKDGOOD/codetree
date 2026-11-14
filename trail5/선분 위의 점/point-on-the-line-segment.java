import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[] points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        StringBuilder sb= new StringBuilder();
        int a, b;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            sb.append(upperBound(b) - lowerBound(a) + "\n");
        }
        System.out.print(sb.toString());
    }

    public static int lowerBound(int target) {
        int left = 0, right = n-1;
        int minIdx = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(points[mid] >= target) {
                right = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                left = mid + 1;
            }
        }
        return minIdx;
    }

    public static int upperBound(int target) {
        int left = 0, right = n-1;
        int minIdx = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(points[mid] > target) {
                right = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                left = mid + 1;
            }
        }
        return minIdx;
    }
}