package array;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] name = {"jahorul", "shimu", "fouzia", "islam"};
        for (String x : name) {
            System.out.println(x);
        }

        int[] number = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int x : number) {
            sum = sum + x;

        }
        System.out.println("the sum is " + sum);
        System.out.println("the average is =" + sum / 5);

        double[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum1 = 0;

        for (double y : num) {
            sum1 = sum1 + y;
        }

        System.out.println("the sum is =" + sum1);
        System.out.println("the ave =" + sum1 / 9);
        
        
        

    }

}
