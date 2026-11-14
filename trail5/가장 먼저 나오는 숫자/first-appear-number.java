import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        
        for(int target : queries) {
            int left = 0;
            int right = n-1;
            int minIdx = n;

            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(arr[mid] >= target) {
                    right = mid - 1;
                    if(arr[mid] == target) minIdx = Math.min(minIdx, mid);
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(minIdx == n ? -1 : minIdx+1);
        }
    }
}