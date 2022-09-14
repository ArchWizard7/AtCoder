package Java.ABC264;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        System.out.println("atcoder".substring((L - 1), R));
    }
}