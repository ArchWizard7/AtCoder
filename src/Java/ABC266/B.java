package Java.ABC266;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long mod = 998244353;
        N %= mod;

        if (N >= 0) {
            System.out.println(N);
        } else {
            System.out.println(N + mod);
        }
    }
}