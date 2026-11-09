import java.util.Scanner;
public class Main {
    static int[] pArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pArr = arr;

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            
            int sum = 0;
            for(int a=a1-1; a<a2; a++) {
                sum += pArr[a];
            }
            System.out.println(sum);
        }
    }
}