package Java.ABC262;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] U = new int[M];
        int[] V = new int[M];

        Set<String> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            U[i] = sc.nextInt();
            V[i] = sc.nextInt();

            set.add(U[i] + " " + V[i]);
        }

        int ans = 0;
        for (int a = 1; a <= (N - 2); a++) {
            for (int b = (a + 1); b <= (N - 1); b++) {
                for (int c = (b + 1); c <= N; c++) {
                    boolean b1 = set.contains(a + " " + b);
                    boolean b2 = set.contains(b + " " + c);
                    boolean b3 = set.contains(a + " " + c);

                    if (b1 && b2 && b3)
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
