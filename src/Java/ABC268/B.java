package Java.ABC268;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        System.out.println(T.startsWith(S) ? "Yes" : "No");
    }
}
