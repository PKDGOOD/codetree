import java.util.Scanner;

public class Main {
    public static int NUM_PATIENTS = 3;
    public static int NUM_HOSPITAL = 4;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[NUM_HOSPITAL];
        for(int i=0; i<NUM_PATIENTS; i++) {
            char sym = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(sym == 'Y' && temp >= 37) arr[0]++;
            else if(sym == 'N' && temp >= 37) arr[1]++;
            else if(sym == 'Y' && temp < 37) arr[2]++;
            else arr[3]++;
        }

        for(int i=0; i<NUM_HOSPITAL; i++) {
            System.out.print(arr[i] + " ");
        }
        if(arr[0] >=2) System.out.print("E");
    }
}