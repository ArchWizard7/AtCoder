package Java.ABC264;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int d = Math.max(Math.abs(8 - R), Math.abs(8 - C));

        System.out.println((d % 2 != 0) ? "black" : "white");
    }
}