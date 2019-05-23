import java.util.List;

import static java.lang.Math.pow;

public class Main {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int result=0;
        for(int i =0; i<binary.size(); i++){
            if(binary.get(i)==1){
                result = result + (int)pow(2,i);
            }
        }
        return  result;
    }

}






