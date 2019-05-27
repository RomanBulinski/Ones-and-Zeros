import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

public class Main {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        Collections.reverse(binary);
        int index= binary.size()-1;
        if(binary.get(index)==0){
            binary.remove(index);
            index--;
        }

        int result=0;
        for(int i =0; i<binary.size(); i++){
            if(binary.get(i)==1){
                result = result + (int)pow(2,i);
            }
        }
        return  result;
    }

    // solution from CodeWars
    public static int ConvertBinaryArrayToIntCodeWArs(List<Integer> binary) {

        String result = "0";
        for (Integer i : binary) {
            result += String.valueOf(i);
        }
        return Integer.parseInt(result, 2);
    }


}






