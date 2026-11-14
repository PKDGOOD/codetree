import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long minCount = m;
        long maxCount = 0;
        for(long target=a; target<=b; target++) {
            long count = 0;

            long left = 1, right = m;
            while(left <= right) {
                long mid = left + (right - left) / 2;
                count ++;
                if(mid == target) {
                    if(count < minCount) minCount = count;
                    if(count > maxCount) maxCount = count;
                    break;
                } else if(mid > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        System.out.print(minCount + " " + maxCount);
    }
}