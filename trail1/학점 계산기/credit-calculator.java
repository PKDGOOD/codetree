import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        /* 평균출력*/
        double avg = sum/n;
        System.out.printf("%.1f\n", avg);

        /* 등급 출력*/
        if(avg >= 4.0) System.out.print("Perfect");
        else if(avg >= 3.0) System.out.print("Good");
        else System.out.print("Poor");

    }
}