import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        for (int i = Math.min(a,b); i >= 1; i--) {
            if (a%i==0 && b%i==0) {
               int c = i;
            }
            break;
        }
        int bcnn;
        bcnn = a*b;
        System.out.println("BCNN: " + bcnn);

    }
}
