import java.util.Scanner;

public class Precipitation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of days and precipitation");
        int N = scanner.nextInt();
        int sumOfPrecipitation = 0;
        int maxPrecipitation = 0;

        for(int days = 0; days < N; days++){
            int precipitation = scanner.nextInt();
            sumOfPrecipitation += precipitation;
            if (maxPrecipitation < precipitation){
                maxPrecipitation = precipitation;
            }
        }

        System.out.println("Amount of days: " + N);
        System.out.println("Sum of precipitation: " + sumOfPrecipitation);
        System.out.println("Average of precipitation: " + sumOfPrecipitation / N);
        System.out.println("Maximum of precipitation: " + maxPrecipitation);
    }
}
