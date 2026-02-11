import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherMain {
    public static void main (String[] args) throws FileNotFoundException {
        System.out.println("===============================================================");
        System.out.println("DAILY WEATHER AVERAGES:");
        System.out.println("===============================================================");
        System.out.println("Day    Avg Temperature     Avg Humidity");
        System.out.println("---------------------------------------------------------------");
        // Declare the two 2D arrays:
        double[][] temperature = new double [10][24];
        double[][] humidity = new double[10][24];

        // Read the data from the file.
        // Create a File object, followed by a Scanner object.
        File fileObject = new File ("weather.txt");
        Scanner sc = new Scanner (fileObject); // sc = myScanner = inputs from the user
        // Read the data from the file.
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] strArray = line.split(" ");

            // Using it with an enhanced loop:
            // for (String value : strArray) { // enhanced loop
            // System.out.print(value + " - ");
            // }

            // Put the data that we just read into the corresponding 2D array.
            int day = Integer.parseInt(strArray[0]); // Converting to String
            int hour = Integer.parseInt(strArray[1]); // Converting to String
            double temp = Double.parseDouble(strArray[2]); // Converting to Double
            double hum = Double.parseDouble(strArray[3]); // Converting to Double
            temperature[day - 1][hour] = temp; // -1 because we can't start from 1. We must start from 0 to 9.
            humidity[day - 1][hour] = hum; // -1 because we can't start from 1. We must start form 0 to 9.
        }
        sc.close();

        // Compute the average temperature and average humidity per day and print.
        double avgTemp = 0;
        double avgHumid = 0;

        for (int day = 0; day < 10; day++) { // day = row section
            double dailyTemp = 0;
            double dailyHumid = 0;
            for (int hour = 0; hour < 24; hour++) { // hour = column section
                dailyTemp += temperature[day][hour];
                dailyHumid += humidity[day][hour];

            }

            // Calculate daily averages AFTER the hour loop finishes
            double dailyAvgTemp = dailyTemp / 24.0;
            double dailyAvgHumid = dailyHumid / 24.0;
            // Add to our running total for the grand average
            avgTemp += dailyAvgTemp;
            avgHumid += dailyAvgHumid;

            // Prints the row for a specific day:
            System.out.printf(" %-4d     %-16.2f     %-13.2f\n",
                    (day + 1), dailyAvgTemp, dailyAvgHumid);
        }
        System.out.println("==========================================================================================");
        System.out.printf("Overall Average Temperature: %.2f\n", avgTemp / 10);
        System.out.printf("Overall Average Humidity: %.2f\n", avgHumid / 10);
        System.out.println("Total Readings: " + (10) * (24));
    }
}



