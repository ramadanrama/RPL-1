
package pertemuan_37;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan gaji kariawan : ");
        int n = scan.nextInt();
        System.out.print("masukan jumlah alfa : ");
        int x = scan.nextInt();
        

       float total = (float) (n - (n * 2.5/100));

        if (x > 5) {
            total += 25000;
            System.out.println("gaji kariawan : " + total);
        } else {
            System.out.println("gaji kariawan : " + total );
        }


    }
}

