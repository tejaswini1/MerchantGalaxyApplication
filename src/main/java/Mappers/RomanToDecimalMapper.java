package Mappers;

import java.util.HashMap;

public class RomanToDecimalMapper implements Mappable {

    private HashMap<String,Integer> hashMap =new HashMap();

    public RomanToDecimalMapper(){
        add();
    }

    public void add(){

        hashMap.put("I",1);
        hashMap.put("V",5);
        hashMap.put("X",10);
        hashMap.put("L",50);
        hashMap.put("C",100);
        hashMap.put("D",500);
        hashMap.put("M",1000);
    }


    @Override
    public int getValue(String sym) {
        return hashMap.get(sym);
    }
}
