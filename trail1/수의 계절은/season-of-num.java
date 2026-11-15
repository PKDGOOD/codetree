import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m <= 2 || m == 12) System.out.print("Winter");
        else if(m >= 9) System.out.print("Fall");
        else if(m >= 6) System.out.print("Summer");
        else System.out.print("Spring");
    }
}