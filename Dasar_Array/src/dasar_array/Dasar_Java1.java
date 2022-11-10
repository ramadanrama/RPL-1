
package dasar_array;

import java.util.Scanner;


public class Dasar_Java1 {

    
    public static void main(String[] args) { 
        String nama , alamat ;  
        
        boolean status ; 
        
        Scanner  input = new Scanner(System.in); 
        
        System.out.println("Profil"); 
        System.out.println("--------------"); 
        
        nama = input.nextLine(); 
        System.out.println("Masukkan nama anda :"); 
        alamat = input.nextLine(); 
        System.out.println("Masukkan alamat anda :");  
        
       
        status = input.hasNextBoolean(); 
        System.out.println("Status anda :"); 
        
        System.out.println("------------");
        System.out.println("Nama : " + nama); 
        System.out.println("Alamat :" + alamat); 
        
        System.out.println("status jomlo : " + status);
       
        
       
    }
    
}
