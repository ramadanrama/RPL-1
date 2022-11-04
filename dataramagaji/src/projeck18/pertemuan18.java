
package projeck18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class pertemuan18 {
    public static void main(String[] args) {

    //memggunankan using big integer
    Scanner input = new Scanner(System.in);
    System.out.print("muh.alfin : ");

    
    BigInteger value1 = input.nextBigInteger();
    System.out.println("darwin() : " + value1);

    System.out.print("randi  : ");

   
    BigDecimal value2 = input.nextBigDecimal();
    System.out.println("gibran() : " + value2);

    input.close();
  }
}
