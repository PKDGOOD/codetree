import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        
        // System.out.println("N : " + N);
        // System.out.print("aJinsoo : ");

        int[] aJinsoo = new int[N.length()];
        for(int i=0; i < N.length(); i++) {
            aJinsoo[i] = N.charAt(i)-'0';
        }
    
        // System.out.println(Arrays.toString(aJinsoo));        


        // A진수 -> 10진수
        int num = 0;
        for(int i=0; i<aJinsoo.length; i++) {
            num = num * A + aJinsoo[i];
            
        }


        // 10진수 -> B진수
        int[] bJinsoo = new int[100];
        int idx = 0;
        while(num >= B) {
            bJinsoo[idx] = num%B;
            num /= B;
            idx++;
        }
        bJinsoo[idx] = num;


        // System.out.println();
        // B진수 출력
        for(int i=idx; i>=0; i--) {
            System.out.print(bJinsoo[i]);
        }

    }
}