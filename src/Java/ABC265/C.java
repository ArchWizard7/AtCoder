package Java.ABC265;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] G = new String[H];

        Set<String> set = new HashSet<>();

        int i = 0;
        int j = 0;

        for (int k = 0; k < H; k++)
            G[k] = sc.next();

        while (true) {
            String add = (i + 1) + " " + (j + 1);
            char c = G[i].charAt(j);

            if (set.contains(add)) {
                System.out.println(-1);
                return;
            }

            set.add(add);

            switch (c) {
                case 'U':
                    i--;

                    if (i == -1) {
                        System.out.println(add);
                        return;
                    }

                    break;
                case 'D':
                    i++;

                    if (i == H) {
                        System.out.println(add);
                        return;
                    }

                    break;
                case 'L':
                    j--;

                    if (j == -1) {
                        System.out.println(add);
                        return;
                    }

                    break;
                default:
                    j++;

                    if (j == W) {
                        System.out.println(add);
                        return;
                    }

                    break;
            }
        }
    }
}
