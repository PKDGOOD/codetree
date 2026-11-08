import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;

        int dir = -1;
        for(int j=n-1; j>=0; j--) {
            if(dir < 0) {
                for(int i=n-1; i>=0; i--) {
                    arr[i][j] = cnt++;
                }
            } else {
                for(int i=0; i<n; i++) {
                    arr[i][j] = cnt++;
                }
            }
            dir *= -1;
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}