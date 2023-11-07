import java.util.Scanner;

public class sumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Element " + i+j);
                array[i][j] = scanner.nextInt();
            }
        }
        int x;
        do {
            System.out.println("Enter the column want to sum:");
            x = scanner.nextInt();
            if (x>n) {
                System.out.println("Column needs to be less than " + m);
            }
        } while (x>n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        sumOfColumn(array,m,x);
    }
    public static void sumOfColumn(int[][] array,int m, int x) {
        int sum = 0;
        for (int i = 0; i< m; i++) {
            sum += array[i][x];
        }
        System.out.println("The sum of column " + x + " is " + sum);
    }
}
