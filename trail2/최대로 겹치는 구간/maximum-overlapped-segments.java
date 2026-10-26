import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int start = x1[0];
        int end = x2[0];
        for(int i = 1; i < n; i++) {
            if(x1[i] < start) start = x1[i];
            if(x2[i] > end) end = x2[i];
        }
        // System.out.println("start = " + start + ", end = " + end);


        int result = 0;

        for (int x = start; x < end; x++) {
            // System.out.print("x1 = " + x + ", x2 = " + (x+1));
            int count = 0;
            
            for(int i = 0; i < n; i++) {
                if (x1[i] <= x && x2[i] >= x+1) {
                    count++;
                }

            if (count > result) result = count;
            }
            // System.out.println(", count = " + count);
        }

        System.out.println(result);
    }
}