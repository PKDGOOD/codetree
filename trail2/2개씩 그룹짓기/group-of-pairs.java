import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums = new Integer[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<n; i++) {
            int tmp = nums[i] + nums[2*n-1-i];
            if(tmp > max) max = tmp;
        }

        
        // Integer[] asc = nums;

        // Arrays.sort(nums, Collections.reverseOrder());
        // Integer[] desc = nums;
        
        // int max = 0;
        // for(int i=0; i<n; i++) {
        //     int tmp = asc[i]+ desc[i];
        //     if(tmp > max) max = tmp;
        // }

        System.out.print(max);
    }
}