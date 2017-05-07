package Main;

/**
 * Calculates volume of the water in the cube in which circle shape is also present.
 *
 * @author Grave
 * @version 1.0
 */
public class WaterVolumeCalculator {

    public static void main(String[] args) {

        System.out.println(calculateCubeVolume(4));
        System.out.println(calculateCircleVolume(4));
        System.out.println(calculateWaterVolume(64, 33.51));

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
     *
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
     * @param cubeVolume - volume of the given cube.
     * @param circleVolume - volume of the given circle.
     * @return volume of the water.
     */
    public static double calculateWaterVolume(double cubeVolume, double circleVolume) {
        return Math.round((cubeVolume - circleVolume) * 100) / 100.0;
    }
}
