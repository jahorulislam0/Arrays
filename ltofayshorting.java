
package array;

import java.util.ArrayList;
import java.util.Collections;


public class ltofayshorting {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<>();
        number.add(10);
        number.add(30);
        number.add(40);
        number.add(60);
        number.add(50);
        System.out.println("before sorting ="+number);
        Collections.sort(number);
        System.out.println("after sorting ="+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("decending "+number);
        
        
    }
    
}
