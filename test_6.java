import java.util.Scanner;

public class test_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mark = scan.nextInt();

        if (mark >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        int income = scan.nextInt();

        if (income >= 7000) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
    }
}
