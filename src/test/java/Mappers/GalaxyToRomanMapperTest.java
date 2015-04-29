package Mappers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GalaxyToRomanMapperTest {

    @Test
    public void testGetValue() throws Exception {
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","X");


        assertEquals(10,galaxyToRomanMapper.getValue("glob"));
    }

    @Test
    public void testEquals() throws Exception {
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("perk","L");

        assertEquals(true,galaxyToRomanMapper.equals("perk"));

    }


    @Test
    public void addTest(){
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("tegj","D");

        int decimalValue=galaxyToRomanMapper.getValue("tegj");
        assertEquals(500,decimalValue);
    }
}