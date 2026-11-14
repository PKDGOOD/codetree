import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int right = 0;
        for(int left=0; left<n; left++) {
            while(sum < s && right < n) {
                sum += arr[right];
                right++;
            }
            if(sum >= s) {
                min = Math.min(min, right-left);
            }
            sum -= arr[left];
        }
        System.out.print(min);
    }
}