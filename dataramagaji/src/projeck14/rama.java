
package projeck14;

import java.util.Scanner;
public class rama {
    public static void main(String[] args) {
        // creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your name: ");

    // reads the entire line
    String value = input.nextLine();
    System.out.println("Using nextLine(): " + value);

    input.close();
  }
}
    

