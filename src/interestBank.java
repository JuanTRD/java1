import java.util.Scanner;

public class interestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money amount");
        float amount = scanner.nextInt();
        System.out.println("Enter interest rate/year");
        float interestRate = scanner.nextFloat();
        System.out.println("Enter number of month");
        int month = scanner.nextInt();
        float money=0;
        for (int i = 1; i <= month; i++) {
            money += amount*(interestRate/12)*month;
        }
        System.out.println("Enter total Interest is " + money);
    }
}
