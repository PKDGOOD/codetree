import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int[] a = new int[10];
        a[0] = a1;
        a[1] = a2;
        for(int i=2; i<10; i++) {
            a[i] = a[i-1] + 2*a[i-2];
        }

        for(int i=0; i<10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}