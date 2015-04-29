package Metal;
import Mappers.GalaxyToRomanMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MetalCreditsCalculatorTest {

    @Test
    public void testCalculate() throws Exception {
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","I");

        double result=17.0;
        assertEquals(result,MetalCreditsCalculator.calculate("glob", "glob", 34, galaxyToRomanMapper), 0);

    }
}