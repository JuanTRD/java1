import java.util.Scanner;
import java.util.Arrays;
public class delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number wanted to delete");
        int number = scanner.nextInt();
        //dem so trung voi number
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        int c=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
               array[c] = array[i];
               c++;
            }
        }
        int n=c;
        int[] newArray = new int[n];
        for (int i=0; i<n;i++) {
           newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));

    }
}
