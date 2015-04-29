package Mappers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalMapperTest {

    @Test
    public void getValue(){

        RomanToDecimalMapper romanToDecimalMapper=new RomanToDecimalMapper();
        romanToDecimalMapper.add();

        int value=romanToDecimalMapper.getValue("L");
        assertEquals(50,value);
    }


    @Test
    public void getValue2(){
        RomanToDecimalMapper romanToDecimalMapper=new RomanToDecimalMapper();
        romanToDecimalMapper.add();

        int value=romanToDecimalMapper.getValue("X");
        assertEquals(10,value);

    }
}