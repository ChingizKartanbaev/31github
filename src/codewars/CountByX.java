package codewars;

import java.util.Arrays;

public class CountByX {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBy(100,6)));

    }


    public static int[] countBy(int x, int n){
        int [] arr = new int[n];
        int a = x;
        for (int i = 0; i < n; i++) {
            arr[i] = x;
            x += a;
        }
        return arr;
    }
}
