package task9;

import java.util.Scanner;

public class qus6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();

        double totalTariff = calculateHotelTariff(month, roomRent, daysStayed);

        System.out.printf("Hotel Tariff: %.2f\n", totalTariff);
    }

    public static double calculateHotelTariff(int month, double roomRent, int daysStayed) {
        double totalTariff;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
   
                totalTariff = roomRent * daysStayed * 1.20;
                break;
            default:
                totalTariff = roomRent * daysStayed;
                break;
        }

        return totalTariff;
    }
}
