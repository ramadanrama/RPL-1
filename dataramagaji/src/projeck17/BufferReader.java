
package projeck17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat objek inputstream
        InputStreamReader r = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader rama = new BufferedReader(r);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        nama = rama.readLine ();

        // tampilkan output isi variabel nama
        
        System.out.println("Nama kamu adalah rama " + nama);

    }

    
}
