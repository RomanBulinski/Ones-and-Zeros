import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.pow;

public class Main {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        boolean flag = true;
        int index= 0;
        List<Integer> binaryStart1 = new ArrayList<>();

        while(flag){
            if(binary.get(index)==0){
                index++;
            }else {
                flag = false;
            }
        }

        for(int i = index; i<binary.size(); i++){
            binaryStart1.add(binary.get(i));
        }
        Collections.reverse(binaryStart1);

        int result=0;
        for(int i =0; i<binaryStart1.size(); i++){
            if(binaryStart1.get(i)==1){
                result = result + (int)pow(2,i);
            }
        }
        return  result;
    }

}






