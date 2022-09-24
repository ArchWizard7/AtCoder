package Java.ABC267;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        for (int i = 0; i < days.length; i++) {
            if (S.equals(days[i])) {
                System.out.println(5 - i);
                return;
            }
        }
    }
}
