package Modul_9;
import java.util.Scanner;/*mengimpor kelas Scanner dari paket java.util*/
public class MainPegawai { /*Program ini mendefinisikan kelas MainPegawai.*/
/* Method utama yang akan dieksekusi saat program dijalankan. 
Pada awal method ini, scanner input dibuat untuk membaca input dari pengguna. 
Program ini meminta pengguna untuk memasukkan jumlah pegawai (jumPeg) yang 
akan dimasukkan. Selanjutnya, array karyawan dengan ukuran jumPeg dibuat untuk 
menyimpan objek-objek pegawai.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Pegawai");
        System.out.println("-----------------------------");
        System.out.print("Masukan banyaknya pegawai: ");
        int jumPeg = input.nextInt();
        Pegawai[] karyawan = new Pegawai[jumPeg];
        System.out.println("-----------------------------");
/*Bagian ini adalah loop for yang digunakan untuk menginput data pegawai 
sejumlah jumPeg. Dalam loop ini, pengguna diminta untuk memilih jenis pegawai 
dengan memasukkan angka 1, 2, atau 3. Berdasarkan pilihan tersebut, objek 
pegawai yang sesuai dibuat dan disimpan dalam array karyawan. Selanjutnya, 
pengguna diminta untuk memasukkan nama, NPP, dan gaji pokok pegawai. 
Berdasarkan pilihan jenis pegawai, pengguna juga diminta untuk memasukkan 
tunjangan jabatan, gaji lembur, atau gaji bonus sesuai dengan jenis 
pegawai yang dipilih.*/
        for (int i = 0; i < jumPeg; i++) {
            int pilihan = 0;
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
            System.out.print("Masukan nama Pegawai\t: ");
            karyawan[i].setNama(ketik());
            System.out.print("Masukan NPP Pegawai\t: ");
            karyawan[i].setNpp(input.nextInt());
            System.out.print("Masukan gaji pokok Pegawai\t: ");
            karyawan[i].setGapok(input.nextDouble());
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

/*Bagian ini adalah output dari data pegawai yang telah diinputkan. Untuk 
setiap objek pegawai dalam array karyawan, informasi seperti NPP, nama, dan 
status pegawai ditampilkan. Jika objek adalah Manajer, informasi tambahan 
"Manajer" ditampilkan dan tunjangan dihitung berdasarkan tunjangan jabatan 
dan gaji lembur. Jika objek adalah Pemasaran, informasi tambahan "Pemasaran" 
ditampilkan dan tunjangan dihitung berdasarkan gaji bonus. Jika objek adalah 
Honorer, informasi tambahan "Honorer" ditampilkan dan tunjangan dihitung 
berdasarkan gaji lembur. Selain itu, gaji pokok, tunjangan, dan gaji 
total juga ditampilkan.*/
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Tampilan Pegawai");
        System.out.println("-----------------------------");
        for (int i = 0; i < jumPeg; i++) {
            double tunjangan;
            System.out.print((i + 1) + ". " + karyawan[i].getNpp() + " " + karyawan[i].getNama() + " " + karyawan[i].getStatus());
            if (karyawan[i] instanceof Manajer) {
                //menampilkan status manajer dan menghitung tunjangan manajer
                Manajer man1;
                man1 = (Manajer) karyawan[i];
                System.out.print(" Manajer ");
                tunjangan = man1.getTunJab() + man1.getLembur();
            } else if (karyawan[i] instanceof Pemasaran) {
                //menampilkan status pemasaran dan menghitung tunjangannya
                Pemasaran pem1;
                pem1 = (Pemasaran) karyawan[i];
                System.out.print(" Pemasaran ");
                tunjangan = pem1.getBonus();
            } else if (karyawan[i] instanceof Honorer) {
                //menampilkan status honorer dan hitung tunjangannya
                Honorer hon1;
                hon1 = (Honorer) karyawan[i];
                System.out.print(" Honorer ");
                tunjangan = hon1.getLembur();
            }
            //dilanjutkan mencetak gajiPokok, tunjangan dan gaji total
            //untuk setiap karyawan
            System.out.print(karyawan[i].getGapok() + " " + karyawan[i].getTunjangan() + " " + karyawan[i].hitungGaTot());
            System.out.println("");
        }
    }
/*Method ketik() digunakan untuk membaca input berupa string dari pengguna 
menggunakan objek scanner input dan mengembalikan nilai string yang dibaca.*/
    public static String ketik() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}


