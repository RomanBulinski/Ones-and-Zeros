import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


//    @org.junit.Test
//    public void convertBinaryArrayToInt() throws Exception {
//
//        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
//        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
//        assertEquals(, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
//        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
//
//    }

    //15 -> 1111

    @Test
    public void testMain1(){
        assertEquals(15, Main.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    }

    @Test
    public void testMain2(){
        assertEquals(6, Main.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
    }

    @Test
    public void testMain3(){
        assertEquals(1, Main.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    }

    
}
