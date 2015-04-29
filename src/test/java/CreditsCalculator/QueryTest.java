package CreditsCalculator;

import Mappers.GalaxyToRomanMapper;
import Metal.Metal;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class QueryTest {

    @Test
    public void testRetrieve() throws Exception {

        GalaxyToRomanMapper galaxySymbols=new GalaxyToRomanMapper();
        Metal metal=new Metal();
        Query query=new Query();

        HashMap hashMap1=new HashMap();
        hashMap1.put(0,"glob_perk");

        galaxySymbols.add("glob","X");
        galaxySymbols.add("perk","I");
        String[] tmp={"how","much","is","glob","perk"};
        query.store(tmp,galaxySymbols,metal,1);



        HashMap hashMap2 =query.retrieve();
        assertEquals(hashMap1,hashMap2);


    }
}