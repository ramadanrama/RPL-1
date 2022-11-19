
package pertemuan33;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
      
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;   
      
        
        numbers[0] = -1;

        
        for (int number: positiveNumbers) {
            System.out.print(number + " , ");
        }
    }
}