package Java.ABC263;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N + 1];

        for (int i = 2; i <= N; i++)
            P[i] = sc.nextInt();

        int count = 0;

        while (P[N] != 0) {
            N = P[N];
            count++;
        }

        System.out.println(count);
    }
}