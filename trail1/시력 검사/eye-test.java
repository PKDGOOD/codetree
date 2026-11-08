import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        String msg = "High";

        if(a >= 1 && b >= 1) {
            msg = "High";
        } else if(a >= 0.5 && b >= 0.5) {
            msg = "Middle";
        } else {
            msg = "Low";
        }

        System.out.println(msg);
    }
}