import java.util.*;

class Solution {
    public int solution(int[] arr) {
        long lcm = 1;
        for (int a : arr) {
            lcm = lcm(lcm, a);
            if (lcm > Integer.MAX_VALUE) {
                throw new ArithmeticException("overflow");
            }
        }
        return (int) lcm;
    }

    private long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}