package CreditsCalculator;

import Mappers.*;
import Metal.*;

public class CreditsOfAQuery {


    public static int calculate(String query,Metal metal,GalaxyToRomanMapper galaxyToRomanMapper){


        String[] tmpSymbol=query.split("_");
        double[] tmpValues= new double[tmpSymbol.length];
        int deliminator=tmpSymbol.length;int flag=0;

        for(int temp=0;temp<tmpSymbol.length; temp++) {

            if(metal.equals(tmpSymbol[temp])){
                deliminator=tmpSymbol.length-1;flag=1;
                tmpValues[temp]=metal.getValue(tmpSymbol[temp]);}

            else if (galaxyToRomanMapper.equals(tmpSymbol[temp]))
            tmpValues[temp]=galaxyToRomanMapper.getValue(tmpSymbol[temp]);
            
            else
                return 0;
        }


        return SubstractionConstraints.calculate(galaxyToRomanMapper,deliminator,tmpSymbol,tmpValues,flag);
    }
}
