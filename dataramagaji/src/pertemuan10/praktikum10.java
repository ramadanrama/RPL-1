
package pertemuan10;

import java.util.Scanner;

public class praktikum10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai A   : ");
        int alfin = input.nextInt();
        System.out.print("Nilai B   : ");
        int b = input.nextInt();
        if(alfin>b){
            System.out.println("Nilai rendah : "+b);
            System.out.println("Nilai tinggi : "+alfin);
        }else{
            System.out.println("Nilai rendah : "+alfin);
            System.out.println("Nilai tinggi : "+b);
        }
    }
}
