import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime: ");
        int number = scanner.nextInt();
        int count1 = 0;
        int N = 2;
        while (number>count1) {

                int count =0;
                for (int j = 2; j <= N; j++) {
                    if (N%j==0) {
                        count++;
                    }
                }
                if (count==1) {
                    System.out.print(N + " ");
                    count1++;
                }

            N++;
            }

        }
    }

