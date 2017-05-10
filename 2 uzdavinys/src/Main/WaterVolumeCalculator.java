package Main;

import java.util.Scanner;

/**
 * Calculates volume of the water in the cube in which circle shape is also present.
 *
 * @author Grave
 * @version 1.0
 */
public class WaterVolumeCalculator {

    public static void main(String[] args) {
        start();
    }

    /**
     * Handles the user's input. If input is invalid or negative zero is returned.
     *
     * @param reader for entering input.
     * @return entered user's value or zero.
     */
    public static double doubleInput(Scanner reader) {
        double number = 0;
        try {
            number = Double.parseDouble(reader.nextLine());
        } catch (IllegalArgumentException e) {
            System.err.println("Input must be of double type! " + e.getMessage());
            number = Double.parseDouble(reader.nextLine());
        } finally {
            if (number < 0) {
                return 0;
            } else {
                return number;
            }
        }
    }

    /**
     * Calculates volume of the cube.
     *
     * @param side of the given cube.
     * @return volume of the cube.
     */
    public static double calculateCubeVolume(double side) {
        return Math.pow(side, 3);
    }

    /**
     * Calculates volume of the circle by given diameter.
     *
     * @param diameter of the give circle.
     * @return volume of the circle.
     */
    public static double calculateCircleVolume(double diameter) {
        double radius = diameter / 2;
        return Math.round(4.0 / 3.0 * Math.PI * Math.pow(radius, 3) * 100) / 100.0;
    }

    /**
     * Calculates volume of the water.
     *
     * @param cubeVolume   - volume of the given cube.
     * @param circleVolume - volume of the given circle.
     * @return volume of the water.
     */
    public static double calculateWaterVolume(double cubeVolume, double circleVolume) {
        return Math.round((cubeVolume - circleVolume) * 100) / 100.0;
    }

    public static void start() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Įveskite kubo kraštinės ilgį: ");
        double cubeSide = doubleInput(reader);

        System.out.print("Įveskite rutulio skersmenį: ");
        double circleDiameter = doubleInput(reader);

        reader.close();

        if (cubeSide == 0 || cubeSide < circleDiameter) {
            System.err.println("Wrong parameters!");
        } else {
            System.out.println("Kubo tūris: " + calculateCubeVolume(cubeSide));
            System.out.println("Rutulio tūris: " + calculateCircleVolume(circleDiameter));
            System.out.println("Vandens tūris: "
                    + calculateWaterVolume(calculateCubeVolume(cubeSide), calculateCircleVolume(circleDiameter)));
        }


    }
}
