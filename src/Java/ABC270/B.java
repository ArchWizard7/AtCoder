package Java.ABC270;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        if (Y < 0) {
            X = -X; Y = -Y; Z = -Z;
        }

        if (X < Y) {
            System.out.println(Math.abs(X));
        } else {
            if (Z > Y) {
                System.out.println(-1);
            } else {
                System.out.println(Math.abs(Z) + Math.abs(X - Z));
            }
        }
    }
}
