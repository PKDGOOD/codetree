import java.util.*;

public class Main {
    public static int n;
    public static int answer;
    public static List<Integer> list = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        choose(0);
        
        System.out.println(answer);
    }

    static boolean check() {
        for(int i=0; i<n; i+=list.get(i)) {
            // 2,2,2,2 는 [2,2] [2,2] 로 보면 아름답다고 판별할 수 도 있음. 때문에, 2이면 무조건 2자리 묶음, 3이면 무조건 3자리 묶음이여야 아름다운 수열이니까 그거 체크
            if(i + list.get(i)-1 >= n) {
                return false;
            }

            for(int j=i; j<i+list.get(i); j++) {
                if(list.get(j) != list.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void choose(int cnt) {
        if(cnt == n) {
            if(check()) {
                answer++;
            }
            return;
        }

        for(int i=1; i<=4; i++) {
            list.add(i);
            choose(cnt+1);
            list.remove(list.size()-1);
        }
    }

 gsafe   
}