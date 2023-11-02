import java.util.Scanner;

public class prime100 {
    public static void main(String[] args) {

        System.out.println("The primes that less than 100 are : ");
        for (int i = 0; i <=100; i++) {
                int count =0;
                for (int j = 2; j <= i; j++) {
                    if (i%j==0) {
                        count++;
                    }
                }
                if (count==1) {
                    System.out.print(i + " ");

                }


            }

        }
    }


