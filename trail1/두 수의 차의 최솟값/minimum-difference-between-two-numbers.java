import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i==j) continue;

                int tmp = arr[j] - arr[i];
                if(tmp < min) min = tmp;
            }   
        }

        System.out.print(min);
    }
}