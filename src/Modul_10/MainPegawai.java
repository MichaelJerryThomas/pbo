package Modul_10;
import java.util.Scanner;/*mengimpor kelas Scanner dari paket java.util.Scanner.*/
public class MainPegawai {/*Metode ini merupakan metode utama yang akan dieksekusi saat program dijalankan.*/
    public static void main(String[] args) {
        /*Baris ini membuat objek input dari kelas Scanner yang akan digunakan untuk mengambil input dari pengguna.*/
        Scanner input = new Scanner(System.in);

        /*Menampilkan pesan "Program Pegawai" dan garis pemisah sebagai header program. Kemudian, meminta pengguna 
        untuk memasukkan jumlah pegawai dengan menggunakan System.out.print dan input.nextInt() untuk membaca nilai 
        integer yang dimasukkan oleh pengguna.*/
        System.out.println("Program Pegawai");
        System.out.println("------------------------------");
        System.out.print("Masukan banyaknya pegawai: ");
        int jumPeg = input.nextInt();
        /*Meminta input jenis pegawai dan menginisialisasi objek sesuai pilihan.*/
        Pegawai[] karyawan = new Pegawai[jumPeg];
        System.out.println("------------------------------");

        /*Program melakukan pengulangan sebanyak jumlah pegawai yang dimasukkan untuk mengatur data pegawai.*/
        for (int i = 0; i < jumPeg; i++) {
            int pilihan = 0;
            /*Dilakukan pengulangan dengan menggunakan do-while untuk meminta pengguna memilih jenis pegawai. 
            Pengguna diminta memasukkan angka 1, 2, atau 3. Jika pengguna memasukkan angka diluar rentang tersebut, 
            maka pengulangan akan terus dilakukan hingga angka yang valid dimasukkan.*/
            do {
                System.out.println("Masukan Jenis Pegawai");
                System.out.println("1. Manager");
                System.out.println("2. Pegawai Honorer");
                System.out.println("3. Pegawai Pemasaran");
                System.out.print("Perintah: ");
                pilihan = input.nextInt();
                if (pilihan < 1 || pilihan > 3) {
                    System.out.println("");
                    System.out.println("Masukan angka 1~3");
                    System.out.println("");
                }
            } while (pilihan < 1 || pilihan > 3);
            /*terdapat sebuah switch statement yang berdasarkan pilihan yang dimasukkan pengguna, akan membuat objek 
            pegawai sesuai dengan jenis pegawai yang dipilih. Jika pilihan adalah 1, maka akan dibuat objek Manajer 
            dan disimpan di array karyawan[i]. Jika pilihan adalah 2, maka akan dibuat objek Honorer dan jika pilihan 
            adalah 3, maka akan dibuat objek Pemasaran.*/
            switch (pilihan) {
                case 1:
                    karyawan[i] = new Manajer();
                    break;
                case 2:
                    karyawan[i] = new Honorer();
                    break;
                case 3:
                    karyawan[i] = new Pemasaran();
                    break;
            }
            /*Setelah objek pegawai dibuat, baris-baris ini digunakan untuk menginputkan data pegawai seperti nama, 
            NPP (Nomor Pokok Pegawai), dan gaji pokok. Data-data ini disimpan ke objek pegawai yang sesuai dengan 
            indeks array karyawan[i] menggunakan method setNama(), setNpp(), dan setGapok().*/
            System.out.print("Masukan nama Pegawai\t: ");
            karyawan[i].setNama(ketik());
            System.out.print("Masukan NPP Pegawai\t: ");
            karyawan[i].setNpp(input.nextInt());
            System.out.print("Masukan gaji pokok Pegawai\t: ");
            karyawan[i].setGapok(input.nextDouble());
            /*Pada bagian ini, terdapat switch statement yang memeriksa jenis pegawai yang dipilih oleh pengguna. 
            Berdasarkan jenis pegawai tersebut, akan diminta data tambahan yang khusus untuk jenis pegawai tersebut. 
            Jika pilihan adalah 1 (Manajer), maka akan diminta tunjangan jabatan (setTunJab()). Jika pilihan adalah 2 
            (Honorer), maka akan diminta gaji lembur (setLembur()). Jika pilihan adalah 3 (Pemasaran), maka akan 
            diminta gaji bonus (setBonus()).*/
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan tunjangan jabatan\t: ");
                    karyawan[i].setTunJab(input.nextDouble());
                case 2:
                    System.out.print("Masukan gaji lembur\t: ");
                    karyawan[i].setLembur(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Masukan gaji bonus\t: ");
                    karyawan[i].setBonus(input.nextDouble());
                    break;
            }
        }

        /*menampilkan judul "Tampilan Pegawai" dengan menggunakan garis horizontal sebagai pemisah atas dan bawah judul.*/
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Tampilan Pegawai");
        System.out.println("------------------------------");
        /* Baris ini memulai perulangan for untuk menampilkan data pegawai secara berurutan. Setiap pegawai akan ditampilkan 
        dengan format sebagai berikut: nomor urut pegawai, NPP, nama, dan status.*/
        for (int i = 0; i < jumPeg; i++) {
            double tunjangan;
            System.out.print((i + 1) + ". " + karyawan[i].getNpp() + " " + karyawan[i].getNama() + " " + karyawan[i].getStatus());
            /*Di bagian ini, dilakukan pengecekan menggunakan instanceof untuk mengetahui jenis pegawai yang sedang ditampilkan. 
            Jika pegawai adalah objek Manajer, maka dilakukan casting ke tipe Manajer, kemudian ditampilkan informasi "Manajer". 
            Tunjangan dihitung dengan menjumlahkan tunjangan jabatan (getTunJab()) dan tunjangan lembur (getLembur()) dari objek Manajer.*/
            if (karyawan[i] instanceof Manajer) {
                Manajer man1;
                man1 = (Manajer) karyawan[i];
                System.out.print(" Manajer ");
                tunjangan = man1.getTunJab() + man1.getLembur();
            } else if (karyawan[i] instanceof Pemasaran) {
                Pemasaran pem1;
                pem1 = (Pemasaran) karyawan[i];
                System.out.print(" Pemasaran ");
                tunjangan = pem1.getBonus();
            } else if (karyawan[i] instanceof Honorer) {
                Honorer hon1;
                hon1 = (Honorer) karyawan[i];
                System.out.print(" Honorer ");
                tunjangan = hon1.getLembur();
            }
            /*Baris ini menampilkan informasi gaji pokok (getGapok()), tunjangan (getTunjangan()), total gaji (hitungGaTot()), dan email pegawai 
            (getEmail()) dari objek pegawai saat ini dan mencetak baris kosong sebagai pemisah antara setiap data pegawai yang ditampilkan.*/
            System.out.print(karyawan[i].getGapok() + " " + karyawan[i].getTunjangan() + " " + karyawan[i].hitungGaTot() + " Karyawan email: " 
            + karyawan[i].getEmail());
            System.out.println("");
        }
    }

    /*metode yang digunakan untuk membaca input pengguna berupa string menggunakan objek Scanner.*/
    public static String ketik() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}




