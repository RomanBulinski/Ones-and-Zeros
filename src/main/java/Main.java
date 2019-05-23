import java.util.List;

import static java.lang.Math.pow;

public class Main {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int result=0;
        for(int i =1; i<binary.size(); i++){
            if(binary[i]==0){
                result = result + pow(1,i);
            }
        }
    }

}





//15 -> 1111
