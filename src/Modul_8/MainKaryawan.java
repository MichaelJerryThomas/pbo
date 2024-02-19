package Modul_8;/*membuat package bernama Modul_8*/ 
import java.util.Scanner;/*mengimpor kelas Scanner dari paket java.util.*/ 
public class MainKaryawan {/*kelas utama yang berisi method "main".*/
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);/*objek Scanner yang digunakan untuk 
        meminta masukan dari pengguna.*/
        
        /*Program ini menampilkan pesan pada output yang berisi judul "Data Karyawan" 
        dan meminta user untuk memasukkan jumlah karyawan yang ingin diinputkan melalui scanner.*/ 
        System.out.println("-----------------------------");
        System.out.println("         Data Karyawan       ");
        System.out.println("-----------------------------");
        System.out.print("Masukan banyaknya Karyawan: ");
        Karyawan[] karyawan = new Karyawan[input.nextInt()];/*array dari objek Karyawan. Ukuran 
        array ditentukan oleh input dari pengguna yang diminta sebelumnya.*/
        
        /* membuat loop for yang digunakan untuk mengisi array karyawan dengan objek KaryawanTetap
        atau KaryawanKontrak, tergantung pada pilihan pengguna.*/
        for (int i = 0; i < karyawan.length; i++) {
            int pilihan;
            System.out.println("");
            
            System.out.println("-----------------------------");
            System.out.println("       Data karyawan  "+(i+1)+"      ");
            System.out.println("-----------------------------");
            /*membuat loop do-while yang digunakan untuk memastikan bahwa pilihan pengguna adalah 
            1 atau 2.*/
            do {
                System.out.println("1. Karyawan Tetap");
                System.out.println("2. Karyawan Kontrak");
                System.out.print ("Masukan perintah: ");
                pilihan = input.nextInt();
                if (pilihan > 2 || pilihan < 1) {
                    System.out.println("");
                    System.out.println("Masukan antara 1 dan 2!");
                    System.out.println("");
                }
            } while (pilihan > 2 || pilihan < 1);
            /*membuat statement if-else yang digunakan untuk membuat objek KaryawanTetap atau 
            KaryawanKontrak,tergantung pada pilihan pengguna.*/
            if (pilihan == 1) {
                karyawan[i] = new KaryawanTetap();
            }
            else if (pilihan == 2) {
                karyawan[i] = new KaryawanKontrak();
            }
            /*pemanggilan method untuk mengatur nilai atribut objek karyawan.*/
            System.out.print("Masukan nama          : ");
            karyawan[i].setNama(ketik());
            System.out.print("Masukan NPP           : ");
            karyawan[i].setNPP(input.nextInt());
            System.out.print("Masukan jumlah Anak   : ");
            karyawan[i].setJumlahAnak(input.nextInt());
            if (pilihan == 1) {
                System.out.print("Masukan gaji pokok    : ");
                karyawan[i].setGajiPokok(input.nextDouble());
                System.out.println("");
            }
            else if (pilihan == 2) {
                System.out.print("Jumlah Hari Masuk     : ");
                karyawan[i].setJumlahHariMasuk(input.nextInt());
                System.out.print("Masukan upah perhari  : ");
                karyawan[i].setUpahHarian(input.nextDouble());
                System.out.println("");
            }
        }
        
        System.out.println("");
        /*output yang menampilkan informasi karyawan yang telah dimasukkan oleh pengguna.*/
        for (int i = 0; i < karyawan.length; i++) {
            System.out.println("-----------------------------");
            System.out.println("            Tampilan         ");
            System.out.println("-----------------------------");
            /*membuat statement if-else yang digunakan untuk menampilkan informasi karyawan yang berbeda 
            tergantung pada jenis karyawan (tetap atau kontrak) yang dimasukkan oleh pengguna.*/
            if (karyawan[i] instanceof KaryawanTetap) {
                System.out.println("-----------------------------");
                System.out.println("      Data karyawan tetap    ");
                System.out.println("-----------------------------");
                System.out.println("Nama          : " + karyawan[i].getNama());
                System.out.println("NPP           : " + karyawan[i].getNPP());
                System.out.println("Jumlah Anak   : " + karyawan[i].getJumlahAnak());
                System.out.println("Gaji Pokok    : " + karyawan[i].getGajiPokok());
                System.out.println("Gaji Total    : " + karyawan[i].gajiTotal());
                System.out.println("");
            }
            else if (karyawan[i] instanceof KaryawanKontrak) {
                System.out.println("-----------------------------");
                System.out.println("     Data karyawan kontrak   ");
                System.out.println("-----------------------------");
                System.out.println("Nama          : " + karyawan[i].getNama());
                System.out.println("NPP           : " + karyawan[i].getNPP());
                System.out.println("Jumlah Anak   : " + karyawan[i].getJumlahAnak());
                System.out.println("Hari Masuk    : " + karyawan[i].getJumlahHariMasuk());
                System.out.println("Upah Perhari  : " + karyawan[i].getUpahHarian());
                System.out.println("Upah Total    : " + karyawan[i].upahTotal());
                System.out.println("");
            }
        }
    }
    /*membuat method untuk meminta masukan string dari pengguna.*/
    public static String ketik(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}




