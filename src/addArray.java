
import java.util.Scanner;
import java.util.Arrays;
public class addArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the number want to add");
        int number = scanner.nextInt();
        System.out.println("Enter the index");
        int index = scanner.nextInt();
        int[] newArray = new int[array.length+1];
        if (index>length-1) {
            System.out.println("Cannot add more");
        } else {
            for (int i = 0; i < array.length+1; i++) {
                if (i<index) {
                    newArray[i] = array[i];
                } else if (i==index) {
                    newArray[i] = number;
                } else {
                    newArray[index+1] = array[i-1];
                    index++;
                }
            }
            System.out.println("New Array is " + Arrays.toString(newArray));
        }

    }
}
