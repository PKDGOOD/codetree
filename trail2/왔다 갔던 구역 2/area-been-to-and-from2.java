import java.util.Scanner;
public class Main {
    public static int[] range = new int[2000];
    public static int pos = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        range[pos] += 1;
        System.out.println("pos : " + (pos-1000));
        System.out.println();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            System.out.println("x, dir : " + x + ", " + dir);
            for(int j=0; j<x; j++) {
                if(dir == 'L') {
                    range[pos] += 1;
                    System.out.println("pos : " + (pos-1000));
                    pos--;
                } else {
                    pos++;
                    range[pos] += 1;
                    System.out.println("pos : " + (pos-1000));
                }
            }
             System.out.println();
        }

        int ans = 0;
        for(int i=0; i<2000-1; i++) {
            if(range[i] >= 2 && range[i+1] >= 2) ans++;
        }

        System.out.print(ans);
    }
}