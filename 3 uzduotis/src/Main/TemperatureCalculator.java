package Main;

/**
 * Converts user's entered temperature from Kelvin to Celsius, Fahrenheit & Reaumur scales.
 * @author Grave
 * @version 1.0
 */
public class TemperatureCalculator {

    public static void main(String[] args) {
        System.out.println(calculateCelsius(310.94));
        System.out.println(calculateFahrenheit(310.94));
        System.out.println(calculateReaumur(310.94));
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
}
