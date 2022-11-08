
package projeck22;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    // input 
    Scanner input = new Scanner(System.in);
    System.out.print("100: ");

    // output
    BigInteger value1= input.nextBigInteger();
    System.out.println("20:" + value1);

    System.out.print("300: ");

    // eksekusi
    BigDecimal value2 = input.nextBigDecimal();
    System.out.println("200(): " + value2);

    input.close();
  }
}
