import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        int min;
        if (a < b) {
            min = a;
        } else {
             min = b;
        }

        for (int i = min; i > 0; i--) {
            if (a%i==0 && b%i==0) {
               System.out.println("UCLN is: " + i);
               break;
            }
        }


    }
}
