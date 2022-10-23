package Java.ABC271;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = String.format("%02x", N).toUpperCase();

        System.out.println(ans);
    }
}
