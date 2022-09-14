package Java.ABC263;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int[] count = new int[13];
        boolean c2 = false;
        boolean c3 = false;

        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
            count[A[i] - 1]++;
        }

        for (int i = 0; i < 13; i++) {
            if (count[i] == 2)
                c2 = true;

            if (count[i] == 3)
                c3 = true;
        }

        System.out.println((c2 && c3) ? "Yes" : "No");
    }
}