import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int lastIdx = -1;
        for(int i=0; i<10; i++) {
            int tmp = sc.nextInt();
            if(tmp == 0) break;

            arr[i] = tmp;
            lastIdx = i;
        }

        for(int i=lastIdx; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}