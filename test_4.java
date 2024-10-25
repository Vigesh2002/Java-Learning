import java.lang.System;
import java.util.Scanner;

class test_4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String departement = scan.nextLine();


        System.out.println("My name is " + name);
        System.out.println("My score is " + score/10 + " / 10");
        System.out.println("My departement is " + departement);
    }
}