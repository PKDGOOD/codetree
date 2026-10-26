public class Main {
    public static void main(String[] args) {
        double ftToCm = 30.48;
        int miToCm = 160934;

        double ft = 9.2, mi = 1.3;

        System.out.printf("%.1fft = %.1fcm\n", ft, ft*ftToCm);
        System.out.printf("%.1fmi = %.1fcm", mi, mi*miToCm);

    }
}