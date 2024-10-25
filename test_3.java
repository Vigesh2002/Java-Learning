import java.lang.System;
import java.util.Scanner;

class test_3 {
    public static void main(String args[]) {
        Scanner number = new Scanner(System.in);

        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();

        int d = a*b*c;
        int e = a+b+c;

        int f = d/e;

        System.out.println(f);
    }
}