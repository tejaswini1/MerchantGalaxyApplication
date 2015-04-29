package Metal;

import Mappers.GalaxyToRomanMapper;

public class MetalCreditsCalculator {

    public static double calculate(String galaxySymbol1,String galaxySymbol2,int credits,GalaxyToRomanMapper galaxyToRomanMapper){

            int galaxyValue1=galaxyToRomanMapper.getValue(galaxySymbol1);
            int galaxyValue2=galaxyToRomanMapper.getValue(galaxySymbol2);

            if(galaxyValue1<galaxyValue2)
                return credits/(double)(galaxyValue2- galaxyValue1);

            return (double)credits/(galaxyValue1+galaxyValue2);
    }
}
