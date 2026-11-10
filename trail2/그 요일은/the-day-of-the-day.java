import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int dayDiff = dateToDays(m2, d2) - dateToDays(m1, d1) ;

        System.out.print(dayDiff/7 + (dayDiff % 7 >= daysFromMon(A) ? 1 : 0));
        
    }
    public static int dateToDays(int m, int d) {
        int[] daysOfMonth = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;
        for(int i=0; i < m-1; i++) {
            days += daysOfMonth[i];
        }
        days += d;
        return days;
    }

    public static int daysFromMon(String A) {
        String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int index = 0;
        for(int i = 0; i<days.length; i++) {
            if(days[i].equals(A)) {
                index = i;
                break;
            }
        }
        return index;
    }
}