
package array;

import java.util.ArrayList;


public class itofay2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1=new ArrayList<Integer>();
        ArrayList<Integer> number2=new ArrayList<Integer>();
        ArrayList<Integer> number3=new ArrayList<Integer>();
        
       number1.add(10);//add element
       number1.add(20);
       number1.add(30);
       number1.add(40);
        System.out.println("number1 = "+number1);
        number2.addAll(number1);
        System.out.println("number 2="+number2);//add all methode
        number3.addAll(number1);
        System.out.println("number 3="+number3);
        
        boolean result=number1.equals(number3);//equal methode
        System.out.println("equality ="+result);
       
        
        
    }
    
}
