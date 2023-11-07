import java.util.Scanner;

public class maxx2Dimension {
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
        maxx(array,m,n);
    }
    public static void maxx(int[][] array,int m, int n) {
        int max=array[0][0];
        for (int i = 0; i< m; i++) {
            for (int j = 0; j<n;j++){
                if (array[i][j]>max) {
                    max=array[i][j];
                }
            }
        }
        System.out.println("The max is: " + max);
    }
}
