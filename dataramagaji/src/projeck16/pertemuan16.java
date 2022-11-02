
package projeck16;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class pertemuan16 {
    
    public static void main(String[] args) {
        
    
    // membuat objek data
     Scanner input = new Scanner(System.in);
     System.out.print("kg : ");

    //membaca bilangan bulat
    
    BigInteger value22 = input.nextBigInteger();
    System.out.println("polume (): " + value22);
    System.out.print("tinggi: ");

    // eksekusi
    BigDecimal value20 = input.nextBigDecimal();
    System.out.println("polume (): " + value20);

    input.close();
  }
}

