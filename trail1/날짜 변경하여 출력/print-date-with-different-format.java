import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = new Scanner(System.in).next().split("\\.");

        System.out.print(arr[1] + "-" + arr[2] + "-" + arr[0]);
    }
}