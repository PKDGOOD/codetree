import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        char genA = sc.next().charAt(0);
        int ageB = sc.nextInt();
        char genB = sc.next().charAt(0);

        System.out.print(ageA >= 19 && genA == 'M' || ageB >= 19 && genB == 'M' ? 1 : 0);
    }
}