import java.util.Scanner;

public class Test3 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        int max = Math.max(b, a);

        int i = max;
        while (true) {
            if (i%a==0 && i%b==0) {
                System.out.println(i);
                return;
            }
            i++;
        }
//        if (a < b) {
//            for (int i = 1; i <=a; i++) {
//                if ((a*i)%b==0) {
//                    System.out.print(i*a + " ");
//                    break;
//                }
//            }
//        } else {
//            for (int i = 1; i <=b; i++) {
//                if ((b*i)%a==0) {
//                    System.out.print(i*b + " ");
//                    break;
//                }
//            }
//        }
    }
}
