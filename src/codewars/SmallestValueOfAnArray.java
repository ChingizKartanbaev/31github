package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallestValueOfAnArray {

    public static void main(String[] args) {
        int[] arr = {7, 12, 3, 2, 27};
        System.out.println(findSmallest(arr, "index"));
    }

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int min = 0;
        int minIndex = 0;

        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        if(toReturn.equals("value")){
            return numbers[minIndex];
        }
        else if(toReturn.equals("index")){
            return min;
        }

        return 0;
    }

}