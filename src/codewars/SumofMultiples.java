package codewars;

public class SumofMultiples {
    public static long sumMul(int n, int m) {
        if(n > 0 && m > 0) {
            long res = 0;
            for (int i = n; i < m; i+=n) {
                res += i;
            }
            return res;
        }
        throw new IllegalArgumentException("Input must be a non-negative integer");
    }
}
