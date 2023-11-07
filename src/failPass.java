import java.util.Scanner;

public class failPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        do {
            System.out.println("Enter the size of the array");
            m = scanner.nextInt();
            if (m>30) {
                System.out.println("Size should be less than 30");
            }
        } while (m>30);


        int[] array = new int[m];
        for (int i = 0; i < m; i++) {

                System.out.println("The mark of student " + i + " is: ");
                array[i] = scanner.nextInt();
                if (array[i]<0 || array[i]>10) {
                    System.out.println("Wrong");
                    array[i] = scanner.nextInt();
                }

        }
        isPass(array);
    }
    public static void isPass(int[] array) {
        int count = 0;
        System.out.println("List of marks: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if (array[i]<=10 && array[i]>=5){
                count++;
            }
        }
        System.out.println();
        System.out.println("There has " + count + " students pass the tests");
    }
}

