package Modul_7;
import java.util.Scanner; //membuat variabel untuk scanner
/*membuat kelas MainKaryawan bertipe main*/
public class MainKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*membuat scanner untuk input dari keyboard*/

        /*Menerima input data dari user untuk membuat objek KaryawanTetap, seperti NPP, Nama, Jumlah Anak, dan Gaji Pokok*/
        System.out.println("Masukkan data Karyawan Tetap:");
        System.out.print("NPP : ");
        int npp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah Anak : ");
        int jumlahAnak = scanner.nextInt();
        System.out.print("Gaji Pokok : ");
        int gajiPokok = scanner.nextInt();

        /*Membuat objek KaryawanTetap berisi npp, nama, jumlahAnak, gajiPokok*/
        KaryawanTetap karyawanTetap = new KaryawanTetap(npp, nama, jumlahAnak, gajiPokok);

        /*Menerima input data karyawan kontrak yang meminta pengguna untuk memasukkan NPP, nama, jumlah anak, 
        upah harian, dan jumlah hari masuk dari karyawan kontrak melalui input scanner.*/
        System.out.println("\nMasukkan data Karyawan Kontrak:");
        System.out.print("NPP : ");
        npp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Jumlah Anak : ");
        jumlahAnak = scanner.nextInt();
        System.out.print("Upah Harian : ");
        int upahHarian = scanner.nextInt();
        System.out.print("Jumlah Hari Masuk : ");
        int jumlahHariMasuk = scanner.nextInt();

        /*Membuat objek KaryawanKontrak yang berisi npp, nama, jumlahAnak, upahHarian, jumlahHariMasuk*/
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(npp, nama, jumlahAnak, upahHarian, jumlahHariMasuk) {};

        /*Menampilkan data karyawan tetap dan kontrak yang telah dimasukkan sebelumnya, 
        dengan menggunakan method displayData() untuk menampilkan data karyawan dan hitungGajiTotal() untuk menampilkan gaji total karyawan tetap*/
        System.out.println("\nData Karyawan Tetap:");
        karyawanTetap.displayData();
        System.out.println("Gaji Total : " + karyawanTetap.hitungGajiTotal());
        System.out.println("\nData Karyawan Kontrak:");
        karyawanKontrak.displayData();
    }
}

