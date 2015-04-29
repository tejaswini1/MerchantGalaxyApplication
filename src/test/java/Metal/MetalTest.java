package Metal;
import Mappers.GalaxyToRomanMapper;
import org.junit.Test;

import static org.junit.Assert.*;


public class MetalTest {

    @Test
    public void testSetValue() throws Exception {
        Metal metal=new Metal();
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","I");
        metal.setValue("glob","glob","silver","34",galaxyToRomanMapper);

        assertEquals(17.0, metal.getValue("silver"),0.0);
    }

    @Test
    public void testEquals() throws Exception {
        Metal metal=new Metal();
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","I");
        metal.setValue("glob","glob","silver","34",galaxyToRomanMapper);

        assertEquals(true, metal.equals("silver"));
    }

    @Test
    public void testGetValue() throws Exception {

    }
}