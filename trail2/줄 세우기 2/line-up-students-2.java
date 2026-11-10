import java.util.*;

class Student {
    int n, h, w;

    public Student(int n, int h, int w) {
        this.n = n;
        this.h = h;
        this.w = w;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            students[i] = new Student(i+1, h, w);
        }

        Arrays.sort(students, (a,b) -> {
            if(a.h != b.h) return a.h - b.h;
            return b.w - a.w;
        });

        for(Student student : students) {
            System.out.println(student.h + " " + student.w + " " + student.n);
        }
    }
}
