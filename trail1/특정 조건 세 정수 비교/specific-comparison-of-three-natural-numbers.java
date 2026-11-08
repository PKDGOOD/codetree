import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int first = 0;
        int second = 0;

        if(a <= b && a <= c) first = 1;
        if(a == b && b == c) second = 1;

        System.out.print(first + " " + second);
    }
}