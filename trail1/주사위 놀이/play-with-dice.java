import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[7]
        for(int i=0; i<10; i++) {
            int idx = sc.nextInt();
            arr[idx]++;
        }

        for(int i=1; i<=6; i++) {
            System.out.print(i + " - " + arr[i]);
        }
    }
}