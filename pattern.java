package array;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter the line =");
        num = input.nextInt();

        for (int row = 0; row <= num; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" " + col);

            }
            System.out.println();

        }
    }

}
