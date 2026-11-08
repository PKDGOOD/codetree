import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = c;
        if((b<a && a<c) || (c<a && a<b)) {
            result = a;
        } else if ((a<b && b<c) || (c<b && b<a)) {
            result = b;
        }

        System.out.print(result);
    }
}