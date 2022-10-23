
package datarama;

//mengimpor Scanner ke program
import java.util.Scanner;

public class datagajirama {
    
    public static void main(String[] args) {
        //deklarasi vaeriabel
        String nama,alamat;
        int usia,gaji;
        
        //membuat Scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //tampilan output ke user
        System.out.println("### pendaftaran karyawan PT.passokkorang ###");
        System.out.println("nama : ");
        
        //menggunakan Scanner dan menyimpan apa yang diketik di variabel
        nama = keyboard.nextLine();
        
        //tampilan output lagi
        System.out.println("alamat: ");
        
        //menggunakan Scanner lagi
        alamat = keyboard.nextLine();
        
        System.out.println("usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("gaji: ");
        gaji = keyboard.nextInt();
        
        
        //menampilkan apa yang sudah di variabel
        System.out.println("--------------------");
        System.out.println("nama: " + nama);
        System.out.println("alamat: " + alamat);
        System.out.println("usia: " + usia + " tahun");
        System.out.println("gaji: Rp " + gaji);
        
        
    }
    
}
