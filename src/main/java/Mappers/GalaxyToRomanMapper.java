package Mappers;


import java.util.HashMap;

public class GalaxyToRomanMapper implements Mappable{

    private HashMap<String,String> hashMap=new HashMap();

    public void add(String galaxySymbol,String romanSymbol){
        hashMap.put(galaxySymbol,romanSymbol);
    }

    @Override
    public int getValue(String galaxySymbol) {
       return new RomanToDecimalMapper().getValue(hashMap.get(galaxySymbol));
    }

    public boolean equals(String symbol){
        return hashMap.containsKey(symbol);
    }
}
