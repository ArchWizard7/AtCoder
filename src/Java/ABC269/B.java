package Java.ABC269;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[10];

        for (int i = 0; i < 10; i++)
            S[i] = sc.next();

        int A = -1;
        int B = -1;
        int C = -1;
        int D = -1;

        boolean flag1 = false;
        for (int i = 0; i <= 9; i++) {
            if (flag1) break;

            for (int j = 0; j <= 9; j++) {
                if (S[i].charAt(j) == '#') {
                    A = i + 1;
                    C = j + 1;
                    flag1 = true;
                    break;
                }
            }
        }

        boolean flag2 = false;
        for (int i = 9; i >= 0; i--) {
            if (flag2) break;

            for (int j = 9; j >= 0; j--) {
                if (S[i].charAt(j) == '#') {
                    B = i + 1;
                    D = j + 1;
                    flag2 = true;
                    break;
                }
            }
        }

        System.out.println(A + " " + B);
        System.out.println(C + " " + D);
    }
}
