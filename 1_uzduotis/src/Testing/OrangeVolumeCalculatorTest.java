package Testing;

import org.junit.Test;
import Main.OrangeVolumeCalculator;
import static junit.framework.TestCase.assertEquals;

public class OrangeVolumeCalculatorTest {

    @Test
    public void orangeVolumeReturnsCorrectValue() {
        assertEquals("With input 10 and 1 should return 268.08", 268.08,
                OrangeVolumeCalculator.computeOrangeVolume(OrangeVolumeCalculator.computeOrangeRadius(10, 1)));
    }

    @Test
    public void orangeVolumeShouldReturnZeroWithZeroDiameter() {
        assertEquals("With 0 diameter should return 0", 0.0,
                OrangeVolumeCalculator.computeOrangeVolume(OrangeVolumeCalculator.computeOrangeRadius(0, -1)));
    }


}
