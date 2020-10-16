
package array;

import java.util.ArrayList;


public class ltofay {
    public static void main(String[] args) {
        ArrayList <Integer> number=new ArrayList<Integer>();//declearthe arraylist
        
        
        //add element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
       System.out.println("before removing array="+number);
        
        
        System.out.println("");
        
        
        number.remove(2);//remove element  
        System.out.println("after removing "+number);
        
        //number.removeAll(number);//remove all element
        //System.out.println("all remove"+number);
        
        //number.clear();//clear 
        //System.out.println("all clear ="+number);
        
       
        
        
          boolean cheakh=number.isEmpty();//empty cheakh
          System.out.println("arraylist cheakh ="+cheakh);
          
          boolean b =number.contains(40);//arraylist cheakh elements
          System.out.println("contain ="+b);
          
          int i =number.indexOf(40);//cheakh index
          System.out.println("index of 40 ="+i);
          
          number.set(2, 50);//replace
          System.out.println("after setting ="+number);
          
          int j =number.get(2);//get 
          System.out.println("get output ="+j);
        
        
        
        
        
    }
    
}
