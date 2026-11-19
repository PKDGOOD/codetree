import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        boolean result = false;
        if(y % 4 == 0) {
            result = true;
            if(y % 100 == 0 && y % 400 != 0) {
                result = false;
            }
        }
        System.out.println(result);
    }
}