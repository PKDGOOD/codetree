import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new Scanner(System.in).next().split("-");

        System.out.printf("010-%s-%s",arr[2], arr[1]);
    }
}