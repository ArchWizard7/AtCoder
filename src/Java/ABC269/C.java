package Java.ABC269;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        String S = Long.toBinaryString(N);

        int count = 0;
        long pow = 1;
        long[] bit = new long[60];

        for (int i = 0; i < S.length(); i++) {
            if (((N >> i) & 1) == 1) {
                bit[count] = pow;
                count++;
            }

            pow *= 2;
        }

        for (int i = 0; i < (int) Math.pow(2, count); i++) {
            long tmp = 0;

            for (int j = 0; j < count; j++) {
                if (((i >> j) & 1) == 1)
                    tmp += bit[j];
            }

            System.out.println(tmp);
        }
    }
}
