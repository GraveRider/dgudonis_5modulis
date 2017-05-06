package Main;

import java.util.Scanner;

/**
 * Class calculates the volume of the given orange.
 *
 * @author Grave
 * @version 1.0
 */
public class OrangeVolumeCalculator {

    /**
     * Entry point of the program.
     *
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
    public static double input(Scanner reader) {
        try {
            return Double.parseDouble(reader.nextLine());

        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument! Argument must be positive and a type of double!");
        }

        return 0;
    }


    /**
     * Computes the radius of the given orange.
     *
     * @param diameter  of the given orange.
     * @param thickness of the given orange.
     * @return radius of the given orange.
     */
    public static double computeOrangeRadius(double diameter, double thickness) {
       if (isValidInput(diameter, thickness)) {
           return (diameter - thickness * 2) / 2;
       }
       return 0;
    }

    /**
     * Computes the volume of the given orange.
     *
     * @param radius of the given orange.
     * @return volume of the given orange.
     */
    public static double computeOrangeVolume(double radius) {
        return Math.round(4.0 / 3.0 * Math.PI * Math.pow(radius, 3) * 100) / 100.0;
    }

    /**
     * Checks if the given input is valid for computing orange volume.
     *
     * @return false if input is not valid, else true.
     */
    public static boolean isValidInput(double diameter, double thickness) {
        if (diameter <= 0 || thickness <= 0 || diameter == thickness) {
            return false;
        }
        return true;
    }

    /**
     * Starts the program.
     */
    public static void start() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Įveskite apelsino skersmenį: ");
        double diameter = input(reader);

        System.out.print("Įveskite apelsino žievelės storį: ");
        double thickness = input(reader);

        System.out.println(computeOrangeVolume(computeOrangeRadius(diameter, thickness)));
    }
}
