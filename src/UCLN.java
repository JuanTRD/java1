import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
<<<<<<< HEAD
        int min;
=======
int min;
>>>>>>> 8ab04cbc864a5fbf3e0410fd957f615b3d854318
        if (a < b) {
            min = a;
        } else {
             min = b;
        }
<<<<<<< HEAD

        for (int i = min; i > 0; i--) {
            if (a%i==0 && b%i==0) {
               System.out.println("UCLN is: " + i);
               break;
            }
        }

=======
>>>>>>> 8ab04cbc864a5fbf3e0410fd957f615b3d854318

        for (int i = min; i > 0; i--) {
            if (a%i==0 && b%i==0) {
               System.out.println("UCLN is: " + i);
               break;
            }
        }
    }
}
