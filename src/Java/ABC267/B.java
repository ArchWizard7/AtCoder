package Java.ABC267;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.charAt(0) == '1') {
            System.out.println("No");
        } else {
            boolean[] col = new boolean[7];

            if (S.charAt(6) == '0') col[0] = true;
            if (S.charAt(3) == '0') col[1] = true;
            if (S.charAt(1) == '0' && S.charAt(7) == '0') col[2] = true;
            if (S.charAt(0) == '0' && S.charAt(4) == '0') col[3] = true;
            if (S.charAt(2) == '0' && S.charAt(8) == '0') col[4] = true;
            if (S.charAt(5) == '0') col[5] = true;
            if (S.charAt(9) == '0') col[6] = true;

            for (int i = 0; i <= 4; i++) {
                boolean b1 = col[i];

                for (int j = (i + 1); j <= 5; j++) {
                    boolean b2 = col[j];

                    for (int k = (j + 1); k <= 6; k++) {
                        boolean b3 = col[k];

                        if (!b1 && b2 && !b3) {
                            System.out.println("Yes");
                            return;
                        }
                    }
                }
            }

            System.out.println("No");
        }
    }
}
