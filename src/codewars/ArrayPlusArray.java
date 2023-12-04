package codewars;

public class ArrayPlusArray {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int res1 = 0;
        int res2 = 0;
        for (int j : arr1) {
            res1 += j;
        }
        for (int j : arr2) {
            res2 += j;
        }

        return res1 + res2;
    }


}

