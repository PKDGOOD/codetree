import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        

        /* 탐색 선분 범위 인덱스 조회 - min, max*/
        int min = 100;
        for(int num : start) {
            if(num < min) min = num;
        }
        int max = 1;
        for(int num : end) {
            if(num > max) max = num;
        }
        // System.out.printf("min : %d, max : %d", min, max);
        
        /* 선분 범위 내 각 점 순회하면서 최댓값 찾기*/
        int result = 0;
        for(int i = 1; i <= max; i++) {
            int count = 0;
            for(int x=0; x<n; x++) {
                if(i >= start[x] && i <= end[x]) count++;
            }
            if(count > result) result = count;
        }

        System.out.print(result);
    }
}