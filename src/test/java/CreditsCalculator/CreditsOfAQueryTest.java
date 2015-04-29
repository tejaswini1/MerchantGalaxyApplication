package CreditsCalculator;

import Mappers.GalaxyToRomanMapper;
import Metal.Metal;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreditsOfAQueryTest {
    @Test
    public void TestcalculateForMetal(){
        String query="glob_perk_silver";
        Metal metal=new Metal();
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","I");
        galaxyToRomanMapper.add("perk","X");
        metal.setValue("glob","glob","silver","34",galaxyToRomanMapper);

        assertEquals(153,CreditsOfAQuery.calculate(query,metal,galaxyToRomanMapper));
    }


    @Test
    public void Testcalculate(){
        String query="glob_perk";
        Metal metal=new Metal();
        GalaxyToRomanMapper galaxyToRomanMapper=new GalaxyToRomanMapper();
        galaxyToRomanMapper.add("glob","I");
        galaxyToRomanMapper.add("perk","X");


        assertEquals(9,CreditsOfAQuery.calculate(query,metal,galaxyToRomanMapper));
    }

}