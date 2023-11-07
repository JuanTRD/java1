
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();
        System.out.println("Enter the character: ");

        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (c)) {
                count++;
            }
        }
        System.out.println(c + " has " + count + " times");
    }
}

