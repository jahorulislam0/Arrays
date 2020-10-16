
package array;

import java.util.Arrays;




public class sortingARRay {
    public static void main(String[] args) {
        
        int [] number ={5,8,-4,5,9};
        
        Arrays.sort(number);
        
        System.out.print("Acending :");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
           
            
        }
        System.out.println();
        System.out.println("Decending :");
        
        for (int i =4; i>=0; i--) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println();
        String[] names= {"jahorul","foujia","shimu","islam"};
        Arrays.sort(names);
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print(" "+names[i]);
            
        }
        
        System.out.println();
        for (int i = 3; i >=0; i--) {
            System.out.print(" "+names[i]);
            
        }     
    }
    
}
