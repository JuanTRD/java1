import java.util.Scanner;

public class drawIo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice!=0) {

            System.out.println("Menu");
            System.out.println("1. Draw Square");
            System.out.println("2. Draw a Line");
            System.out.println("3. Draw a Rectangle");
            System.out.println("4. Draw a Triangle");
            System.out.println("0. Exit");
            System.out.println("Make your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("****");
                    }
                    break;
                case 2:
                    System.out.println("****");
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("******");
                    }
                    break;
                case 4:
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
