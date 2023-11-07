import java.util.Arrays;
import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array1");
        int length1 = scanner.nextInt();
        System.out.println("Enter the length of the array2");
        int length2 = scanner.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element " + i);
            array1[i] = scanner.nextInt();
        }
        int[] array2 = new int[length2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Element " + i);
            array2[i] = scanner.nextInt();
        }
        mergeArray(array1,array2);
    }
    public static void mergeArray(int[] array1, int[] array2){
        int[] newArray = new int[array1.length+array2.length];
        int index = 0;
        for(int i=0; i<newArray.length; i++){
            if (i<array1.length) {
                newArray[i] = array1[i];
            } else {
                newArray[i] = array2[index];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
