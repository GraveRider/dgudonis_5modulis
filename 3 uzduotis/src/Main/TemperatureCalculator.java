package Main;

import java.util.Scanner;

/**
 * Converts user's entered temperature from Kelvin to Celsius, Fahrenheit & Reaumur scales.
 *
 * @author Grave
 * @version 1.0
 */
public class TemperatureCalculator {

    public static void main(String[] args) {
        start();
    }

    public static double doubleInput(Scanner reader) {
        double number = 0;
        while (true) {
            try {
                number = Double.parseDouble(reader.nextLine());
                if (true) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Incompatible type! " + e.getMessage());
            }
        }
        reader.close();
        return number;
    }

    public static double calculateCelsius(double kelvin) {
        return Math.round((kelvin - 273.15) * 100) / 100D;
    }

    public static double calculateFahrenheit(double kelvin) {
        return Math.round((kelvin * 9 / 5 - 459.67) * 100) / 100D;
    }

    public static double calculateReaumur(double kelvin) {
        return Math.round(((kelvin - 273.15) * 4 / 5) * 100) / 100D;
    }

    public static void start() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite temperatūra kelvino skalėje: ");
        double kelvin = doubleInput(reader);

        System.out.println(calculateCelsius(kelvin) + " Celsijaus laipsnių");
        System.out.println(calculateFahrenheit(kelvin) + " Farenheito laipsnių");
        System.out.println(calculateReaumur(kelvin) + " Reomiūro laipsnių");
    }
}
