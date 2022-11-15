
package pertemuan29;

import java.util.Scanner;
public class hargadiskon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("harga produk = ");
        int harga = sc.nextInt();
        System.out.println("jumlah beli ");
        int qry = sc.nextInt();
        double diskon = 100;
        if(qry>300) {
            diskon  = 100.200;
        }else if(qry>100){
            diskon = 20.50;
        }else if(qry>100) {
            diskon = 3.10;
            
        }
        int harga_awal = harga =qry;
        int harga_diskon = (int) (harga_awal = (int) (harga_awal * diskon));
        
        System.out.println("harga awal = " + harga_awal);
        System.out.println("diskon yang diberikan = " +(diskon*100));
        System.out.println("jumlah diskon =" + (harga_awal*diskon)); 
        System.out.println("harga setelah diskon ="+(harga_diskon));
        
    }
}

