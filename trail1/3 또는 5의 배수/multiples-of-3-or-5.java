import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        System.out.println(a % 3 == 0 ? "YES" : "NO");
        System.out.println(a % 5 == 0 ? "YES" : "NO");
    }
}