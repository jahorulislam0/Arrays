package array;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;
        System.out.println("enter five numbers =");

        for (int i = 0; i < 5; i++) { //get input
            number[i] = input.nextDouble();

        }
        for (int i = 0; i < 5; i++) {//print sum
            sum = sum + number[i];

        }
        System.out.println("the sum is =" + sum);
        System.out.println("the average =" + sum / 5);

        double max = number[0];
        double min = number[0];

        for (int i = 1; i < 5; i++) {

            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }

        }
        System.out.println("maximum =" + max);
        System.out.println("minimum =" + min);

    }

}
