import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        length += 8;
        width *= 3;

        System.out.println(length);
        System.out.println(width);
        System.out.println(length*width);
    }
}