package Java.ABC265;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int N = sc.nextInt();

        if ((X * 3) <= Y) {
            System.out.println(X * N);
        } else {
            int ans = (N / 3) * Y + (N % 3) * X;
            System.out.println(ans);
        }
    }
}