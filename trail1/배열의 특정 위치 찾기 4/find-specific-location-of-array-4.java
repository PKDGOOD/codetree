import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;
        int sum=0;
        for(int i=0; i<10; i++) {
            int tmp = sc.nextInt();
            if(tmp == 0) break;

            if(tmp%2 == 0) {
                count++;
                sum += tmp;
            }
        }

        System.out.print(count + " " + sum);
    }
}