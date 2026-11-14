import java.util.*;

public class Main {
    public static int n;
    public static int m;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            System.out.println(upperBound(x) - lowerBound(x));
        }
    }

    public static int lowerBound(int target) {
        int left = 0, right = n-1;
        int minIdx = n;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] >= target) {
                right = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                left = mid +1;
            }
        }
        return minIdx;
    }

    public static int upperBound(int target) {
        int left = 0, right = n-1;
        int minIdx = n;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > target) {
                right = mid - 1;
                minIdx = Math.min(minIdx, mid);
            } else {
                left = mid +1;
            }
        }
        return minIdx;
    }
}