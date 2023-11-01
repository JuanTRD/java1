import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.println("Enter Car Price: ");
        int carPrice = scanner.nextInt();
        System.out.println("Enter interest rate/year: ");
        double interestRate = scanner.nextDouble();
        double money = salary*(1+interestRate/12) + salary;
        double month = 1;
        while (money<carPrice) {
            money = money*(1+interestRate/12) + salary;
            month++;
        }
        System.out.println((double) month+1);
    }
}
