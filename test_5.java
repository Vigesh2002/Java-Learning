import java.util.Scanner;

public class test_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String meghana = scan.nextLine();

        if(meghana.equals("dead")){
            System.out.println("Surya meets Ramya");
        } else {
            System.out.println("Surya weds Meghana");
        }
    }
}
