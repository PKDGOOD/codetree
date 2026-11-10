import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int sum = 0;
        for(int i=0; i<10; i++) {
            int tmp = sc.nextInt();
            if(tmp < 250) {
                sum += tmp;
            } else {
                System.out.printf("%d %.1f", sum, (double)sum/i); // 마지막수를 제외한 갯수, 분모가 0이면 에러인데 첫번째는 무조건 250미만이므로 신경안써도 됨
                break;
            }
        }
    }
}