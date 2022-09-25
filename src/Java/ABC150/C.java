package Java.ABC150;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];

        for (int i = 0; i < N; i++) P[i] = sc.nextInt();
        for (int i = 0; i < N; i++) Q[i] = sc.nextInt();

        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = (i + 1);

        int count = 1;
        int a = -1;
        int b = -1;

        do {
            String S = Arrays.toString(P);
            String T = Arrays.toString(Q);
            String U = Arrays.toString(h);

            if (S.equals(U)) a = count;
            if (T.equals(U)) b = count;

            count++;
        } while (next_permutation(h, 0, h.length));

        System.out.println(Math.abs(a - b));
    }

    public static boolean next_permutation(int[] array, int start, int end) {
        if (array == null || start > end || start < 0 || end > array.length)
            return false;

        for (int i = end - 2; i >= start; i--) {
            if (array[i] < array[i+1]) {
                int j = end - 1;
                while (array[i] >= array[j])
                    j--;

                int tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;

                Arrays.sort(array, i + 1, end);

                return true;
            }
        }

        return false;
    }
}
