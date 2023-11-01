import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int prime = scanner.nextInt();
        int count = 1;
        for (int i = 2; i <= prime; i++) {
            if (prime%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println(prime + " is prime");
        }
    }
}
