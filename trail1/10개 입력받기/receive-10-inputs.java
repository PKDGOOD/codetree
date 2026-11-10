import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for(int i=0; i<10; i++) {
            int tmp = sc.nextInt();
            if(tmp == 0) break;

            sum += tmp;
            count++;
        }

        System.out.printf("%d %.1f", sum, (double)sum/count);
    }
}