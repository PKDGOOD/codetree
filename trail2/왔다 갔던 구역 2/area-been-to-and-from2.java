import java.util.Scanner;
public class Main {
    public static int[] range = new int[2000];
    public static int pos = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            // System.out.println("x, dir : " + x + ", " + dir);
            
            for(int j=0; j<x; j++) {
                if(dir == 'L') {
                    range[pos] += 1;
                    pos--;
                } else {
                    range[pos] += 1;
                    pos++;
                }
                // System.out.println("pos : " + (pos-1000));
            }
        }

        int ans = 0;
        for(int i=0; i<2000; i++) {
            if(range[i] >= 2) ans++;
        }

        System.out.print(ans);
    }
}