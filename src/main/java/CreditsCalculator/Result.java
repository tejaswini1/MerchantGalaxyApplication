package CreditsCalculator;

import java.util.HashMap;

public class Result {

    public static void display(HashMap<Integer,String> queries,HashMap<Integer,Integer> result){

        for(int count=0;count<queries.size();count++) {

            String tmpString=(String)queries.get(count);
            String[] tmp = tmpString.split("_");

            for(int elementCount=0;elementCount<tmp.length;elementCount++)
                System.out.print(" "+tmp[elementCount]);

            if(result.get(count)!=0)
               System.out.println(  " is " + result.get(count));
        }
    }
}
