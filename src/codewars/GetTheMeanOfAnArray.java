package codewars;

import java.util.Arrays;

public class GetTheMeanOfAnArray {

    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum() / marks.length;
    }

}
