package option1WeeklyTemps;

import java.util.ArrayList;
import java.util.Scanner;



public class Option1WeeklyTemps {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            ArrayList<String> daysOfWeek = new ArrayList<>();
            ArrayList<Double> temperatures = new ArrayList<>();

            System.out.println("Enter daily average temperatures for each day of the week (Mon-Sun):");
            for (int i = 0; i < 7; i++) {
                System.out.print("Enter the day of the week: ");
                String day = scanner.nextLine();
                if (day.equalsIgnoreCase("week")) {
                    break;
                }
                daysOfWeek.add(day);

                System.out.print("Enter temperature for " + day + ":");
                double temperature = scanner.nextDouble();
                scanner.nextLine(); // Consume newline character
                temperatures.add(temperature);
            }

            if (!temperatures.isEmpty()) {
                System.out.println("\nTemperature for each day of the week:");
                for (int i = 0; i < daysOfWeek.size(); i++) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i));
                }

                double sum = 0;
                for (double temp : temperatures) {
                    sum += temp;
                }
                double weeklyAverage = sum / temperatures.size();
                System.out.println("\nWeekly average temperature: " + weeklyAverage);
            } else {
                System.out.println("No temperatures entered for the week.");
            }

            System.out.print("Do you want to enter temperatures for another week? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}

		