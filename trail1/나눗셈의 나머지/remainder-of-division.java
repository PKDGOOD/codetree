import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[10];

        while(a > 1) {
            arr[a%b]++;
            a = a / b;
        }

        int result = 0;
        for(int i : arr) {
            result += i*i;
        }

        System.out.print(result);
    }
}