import java.util.Scanner;

/**
 * Class calculates the volume of the given orange.
 *
 * @author Grave
 * @version 1.0
 */
public class OrangeVolumeCalculator {
    /**
     * Stores the diameter of the orange.
     */
    private static double diameter;
    /**
     * Stores the thickness of the orange.
     */
    private static double thickness;

    /**
     * Entry point of the program.
     * @param args of the String array.
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Accepts only positive input and of the type double.
     *
     * @return given input.
     */
    private static double input() {
        Scanner reader = new Scanner(System.in);
        try {
            double n = Double.parseDouble(reader.nextLine());
            if (n < 0) {
                throw new IllegalArgumentException();
            } else {
                return n;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument! Argument must be positive and a type of double!");
        }
        reader.close();
        return 0;
    }


    /**
     * Computes the radius of the given orange.
     *
     * @param diameter  of the given orange.
     * @param thickness of the given orange.
     * @return radius of the given orange.
     */
    private static double computeOrangeRadius(double diameter, double thickness) {
        return (diameter - thickness * 2) / 2;
    }

    /**
     * Computes the volume of the given orange.
     *
     * @param radius of the given orange.
     * @return volume of the given orange.
     */
    private static double computeOrangeVolume(double radius) {
        return Math.round(4.0 / 3.0 * Math.PI * Math.pow(radius, 3) * 100) / 100.0;
    }

    /**
     * Checks if the given input is valid for computing orange volume.
     *
     * @return false if input is not valid, else true.
     */
    private static boolean isValidInput() {
        if (diameter == 0 || diameter == thickness) {
            OrangeVolumeCalculator.diameter = 0;
            OrangeVolumeCalculator.thickness = 0;

            return false;
        }
        return true;
    }

    /**
     * Starts the program.
     */
    private static void start() {
        System.out.print("Įveskite apelsino skersmenį: ");
        diameter = input();

        System.out.print("Įveskite apelsino žievelės storį: ");
        thickness = input();

        isValidInput();

        System.out.println(computeOrangeVolume(computeOrangeRadius(diameter, thickness)));
    }
}
