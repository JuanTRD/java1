import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        int sum = 0;
        if (a<b) {
            for (int i = a; i <=b; i++) {
                sum +=i;
            }
            System.out.println("Summary is " + sum);
        } else {
            for (int i = b; i <=a; i++) {
                sum +=i;
            }
            System.out.println("Summary is " + sum);
        }
    }
}