import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            String sym = sc.next();
            int temp = sc.nextInt();

            if(sym.equals("Y")) {
                if(temp >= 37) {
                    a++;
                } else {
                    c++;
                }
            } else {
                if(temp >= 37) {
                    b++;
                } else {
                    d++;
                }
            }
        }

        if(a >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}