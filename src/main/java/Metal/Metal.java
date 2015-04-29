package Metal;

import Mappers.GalaxyToRomanMapper;

import java.util.HashMap;

public class Metal {

    private HashMap<String,Double> hashMap=new HashMap();

    public void setValue(String sym1,String sym2,String metal,String value, GalaxyToRomanMapper galaxyToRomanMapper){
        hashMap.put(metal, MetalCreditsCalculator.calculate(sym1, sym2, (Integer.parseInt(value)), galaxyToRomanMapper));

    }



    public boolean equals(String input){
        return hashMap.containsKey(input);
    }

    public double getValue(String symbol){
        return hashMap.get(symbol);

    }

}
