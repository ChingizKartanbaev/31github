package leetCode;

import java.util.Arrays;

public class SumOfAbsoluteDifferencesInASortedArray {

    public static void main(String[] args) {
        int [] arr = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(arr)));
    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int index = 0;
        int [] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                res[index] +=  Math.abs(nums[i] - nums[j]);
            }
            index++;
        }
        return res;
    }
}
