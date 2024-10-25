import java.util.Scanner;

public class comparision_operator {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int num1 = 70;
        int num2 = 100;

        if (num1 > num2) {
            System.out.println("Num1 is Greater");
        } else {
            System.out.println("Num2 is Greater");
        }


        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        if (num3 == num4) {
            System.out.println("Both the numbers are Equal");
        } else {
            System.out.println("Not Equal");
        }


        String a = new String("apple");
        String b = new String("apple");

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
