import java.util.Scanner;

class Forecast {
    String date;
    String day;
    String weather;

    public Forecast(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        Forecast[] arr = new Forecast[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            
            arr[i] = new Forecast(date, day, weather);
        }

        Forecast result = arr[0];
        for(Forecast data : arr) {
            if(data.weather == "Rain" && data.date.compareTo(result.date) > 0) {
                result = data;
            }
        }

        System.out.print(result.date + " " + result.day + " " + result.weather);
    }
}