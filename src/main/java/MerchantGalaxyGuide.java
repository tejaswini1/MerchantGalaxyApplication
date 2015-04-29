import CreditsCalculator.CreditsCalculate;
import CreditsCalculator.Query;
import Mappers.GalaxyToRomanMapper;
import Metal.Metal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MerchantGalaxyGuide {
    public static void main(String[] args) throws IOException {


        GalaxyToRomanMapper galaxyToRomanMapper= new GalaxyToRomanMapper();
        Metal metal=new Metal();
        Query query=new Query();
        CreditsCalculate credit=new CreditsCalculate();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));


        int i=0;
        int queryCount=1;


        while(i<12) {
            String[] input = bufferedReader.readLine().split(" ");
            if(input.length==3)
            {
                galaxyToRomanMapper.add(input[0],input[2]);}

            else if(input.length==6)
                metal.setValue(input[0],input[1],input[2],input[4],galaxyToRomanMapper);

            else{

                query.store(input,galaxyToRomanMapper, metal,queryCount);
                queryCount++;
            }
                i++;
        }
        credit.calculate(query,galaxyToRomanMapper,metal);
        credit.display();

    }

}
