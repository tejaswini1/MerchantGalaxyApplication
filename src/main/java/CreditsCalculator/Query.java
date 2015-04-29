package CreditsCalculator;

import Mappers.GalaxyToRomanMapper;
import Metal.Metal;

import java.util.HashMap;

public class Query {

    private HashMap<Integer,String> queries=new HashMap();

    public void store(String[] query, GalaxyToRomanMapper galaxySymbols,Metal metal,int queryCount){
        int temp=1;
        String tmp="";
        for(String string:query){
            if(metal.equals(string)||galaxySymbols.equals(string)){
                if(temp==1){
                    tmp+=string;temp++;}
                else
                    tmp+="_"+string;
            }
        }
        if (tmp=="")
            queries.put(queryCount-1,"I have no idea what are you talking about");

        else
        queries.put(queryCount-1,tmp);
    }

    public HashMap retrieve(){
        return queries;
    }
}

