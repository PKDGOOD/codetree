import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        printSeason(y,m,d);      
    }

    // 윤년 여부
    public static boolean isYN(int y) {
        if(y%400 == 0) return true;
        if(y%4 == 0 && y%100 == 0) return false;
        if(y%4 == 0) return true;

        return false;
    }

    // 존재하는 날짜인지 여부
    public static boolean isReal(int y, int m, int d) {
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 ||  m == 10|| m == 12) return true;
        else if (m == 2 && d >29) return false;
        else if(!(isYN(y)) && m==2 && d >= 29) return false;
        else if(d > 30) return false;
        else return true;
    }

    // 계절 출력
    public static void printSeason(int y, int m, int d) {
        if(!isReal(y,m,d)) print("-1");
        else if(m >= 3 && m <= 5) print("Spring");
        else if(m >= 6 && m <= 8) print("Summer");
        else if(m >= 9 && m <= 11) print("Fall");
        else print("Winter");
    }

    public static void print(String str) {
        System.out.print(str);
    }
    
}