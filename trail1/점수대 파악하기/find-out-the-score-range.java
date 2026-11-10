import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for(int i=0; i<100; i++) {
            int tmp = sc.nextInt();
            if(tmp == 0) break;
            if(tmp >= 10) {
                arr[tmp/10]++;
            }
        }

        for(int i=10; i>=1; i--) {
            System.out.println(10*i + " - " + arr[i]);
        }
    }
}