
package pertemuan_9;

import java.util.ArrayList;
import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean x = true;
        ArrayList data = new ArrayList();
        while (x) {
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambahkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Exit");
            System.out.println("Pilihan :");
            int plh = input.nextInt();
            if (plh == 1) {
                System.out.println("Lihat Data");
                for (int i = 0; i < data.size(); i++) {
                    System.out.println((i + 1) + " " + data.get(i));
                }
                System.out.println("====================");

            } else if (plh == 2) {
                System.out.println("Tambahkan Data");
                System.out.println("Data Baru :");
                data.add(scan.nextLine());
                System.out.println("==================");

            } else if (plh == 3) {
                System.out.println("Edit Data");
                System.out.println("Data");
                for (int i = 0; i < data.size(); i++) {
                    System.out.println((i + 1) + " " + data.get(i));

                }
                System.out.println("=================");
                System.out.println("Data yang ingin Di ubah :");
                int y = input.nextInt();
                System.out.println("Data :" + data.get(y - 1));
                System.out.println("Data Baru");
                String baru = scan.nextLine();
                data.set(y - 1, baru);
                System.out.println("Data : " + data.get(y-1));
                System.out.println("==============");
            } else if (plh == 4) {
                System.out.println("Delete Data");
                System.out.println("Data");
                for (int i = 0; i < data.size(); i++) {
                    System.out.println((i + 1) + " " + data.get(i));
                }
                System.out.println("=====================");
                System.out.println("Data yang ingin Dihapus :");
                int y = input.nextInt();
                data.remove(y - 1);
                System.out.println("Data Berhasil Dihapus");
            } else {
                System.out.println("Anda data keluar dari program");
                x = false;
            }
        }

    }
}

    

