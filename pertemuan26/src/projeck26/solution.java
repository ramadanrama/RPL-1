
package projeck26;

import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //masukkan kode disini
        System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"Yes":"No");
        
    }
    
}
