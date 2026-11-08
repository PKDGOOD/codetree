import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int cnt = 1;
        
        for(int j=0; j<m; j++) {
            for(int i=0; i<=j; i++) {
                arr[i][j-i] = cnt++;
            }
        }
        
        for(int i=1; i<n; i++) {
            int col = m-1;

            while(i<n && col>0) {
                arr[i][col-i] = cnt++;
            }
        }


        



        // 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}