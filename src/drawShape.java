import java.util.Scanner;

public class drawShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice!=0) {

            System.out.println("Menu");
            System.out.println("1. Draw Square");
            System.out.println("2. Draw a Line");
            System.out.println("3. Draw a Rectangle");
            System.out.println("4. Draw a Triangle");
            System.out.println("5. Draw an Isosceles Triangle");
            System.out.println("0. Exit");
            System.out.println("Make your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int j = 0; j < 4; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i=0;i<4;i++) {
                        for (int j=0;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i=3;i>=0;i--) {
                        for (int j=0;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i=0;i<4;i++) {
                        for (int j=3;j>i;j--) {
                            System.out.print(" ");
                        }
                        for (int j=i;j>=0;j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i=4;i>0;i--) {
                        for (int j=3;j>=i;j--) {
                            System.out.print(" ");
                        }
                        for (int j=i;j>0;j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i=0;i<4;i++) {
                        for (int j=0;j<3-i;j++) {
                            System.out.print(" ");
                        }
                        for (int j=0;j<=i;j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}

