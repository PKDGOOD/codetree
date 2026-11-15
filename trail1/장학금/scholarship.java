import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int fin = sc.nextInt();

        if(mid >= 90) {
            if(fin >= 95) System.out.print(100000);
            else if (fin >= 90) System.out.print(50000);
            else System.out.print(0);
        } else System.out.print(0);
    }
}