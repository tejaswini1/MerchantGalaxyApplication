package CreditsCalculator;

import Mappers.*;
public class SubstractionConstraints {
    public static int calculate(GalaxyToRomanMapper galaxyToRomanMapper,int deliminator,String[] tmpSymbol,double[] tmpValues,int flag){

        int credit=0;

        for(int elementCount=0;elementCount<deliminator-1;elementCount++){

            int tmpChar=galaxyToRomanMapper.getValue(tmpSymbol[elementCount]);
             int tmpChar1=galaxyToRomanMapper.getValue(tmpSymbol[elementCount+1]);


            if(tmpValues[elementCount]<tmpValues[elementCount+1]){
                if(tmpChar==1&&(tmpChar1==5||tmpChar1==10))
                    credit-=tmpValues[elementCount];

                if(tmpChar==10&&(tmpChar1==50||tmpChar1==100))
                    credit-=tmpValues[elementCount];

                if(tmpChar==100&&(tmpChar1==500||tmpChar1==1000))
                    credit-=tmpValues[elementCount];

                if(tmpChar==5||tmpChar==50||tmpChar==500)
                    credit-=tmpValues[elementCount];
        }
        else
            credit+=tmpValues[elementCount];
    }
    credit+=tmpValues[deliminator-1];

    if (flag==1)
    credit*=tmpValues[tmpValues.length-1];

    return credit;


    }
}
