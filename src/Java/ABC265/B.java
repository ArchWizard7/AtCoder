package Java.ABC265;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long T = sc.nextLong();
        int[] A = new int[N + 1];
        int[] bonus = new int[N + 1];

        for (int i = 1; i <= (N - 1); i++)
            A[i] = sc.nextInt();

        for (int i = 1; i <= M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            bonus[X] = Y;
        }

        for (int i = 1; i <= (N - 1); i++) {
            if (T <= A[i]) {
                System.out.println("No");
                return;
            }

            T -= A[i];
            T += bonus[i + 1];
        }

        System.out.println("Yes");
    }
}
