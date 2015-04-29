package CreditsCalculator;

import Metal.*;
import Mappers.*;
import java.util.HashMap;

public class CreditsCalculate {
    private HashMap<Integer,String> queries;
    private HashMap <Integer,Integer>result=new HashMap();



    public void calculate(Query query,GalaxyToRomanMapper galaxySymbols,Metal metal){

        queries=query.retrieve();

        for(int querCount=0;querCount<queries.size();querCount++){

            result.put(querCount,CreditsOfAQuery.calculate(queries.get(querCount),metal,galaxySymbols));

        }
    }

    public void display(){
        Result.display(queries, result);
    }
}
