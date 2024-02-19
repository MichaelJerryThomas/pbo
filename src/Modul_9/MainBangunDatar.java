package Modul_9;
import java.util.Scanner;/*Mengimpor kelas Scanner dari paket java.util*/
/*Kelas MainBangunDatar.*/
public class MainBangunDatar {
    public static void main(String[] args) {
        /*Membuat objek Scanner untuk menerima input dari pengguna.*/
        Scanner input = new Scanner(System.in);
        /*Membuat array objek BangunDatar dengan panjang 3.*/
        BangunDatar[] arrBangunDatar = new BangunDatar[3];
        
        /*Menggunakan perulangan for untuk meminta input bangun datar 
        sebanyak 3 kali.*/
        for (int i = 0; i < arrBangunDatar.length; i++) {
            System.out.println("Bangun datar ke-" + (i+1));
            System.out.println("1. Segiempat");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");

            System.out.print("Pilih bangun datar: ");
            int pilih = input.nextInt();
            
            /*Menggunakan pernyataan switch untuk memilih jenis bangun datar.*/
            switch (pilih) {
                case 1:
                    /*Jika pilihan adalah 1 (Segiempat), minta input panjang 
                    dan lebar.*/
                    System.out.print("Masukkan panjang: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = input.nextDouble();
                    /*Buat objek SegiEmpat dan simpan ke dalam array.*/
                    arrBangunDatar[i] = new SegiEmpat(panjang, lebar);
                    break;
                case 2:
                    /*Jika pilihan adalah 2 (Segitiga), minta input sisi1, 
                    sisi2, dan sisi3.*/
                    System.out.print("Masukkan sisi 1: ");
                    double sisi1 = input.nextDouble();
                    System.out.print("Masukkan sisi 2: ");
                    double sisi2 = input.nextDouble();
                    System.out.print("Masukkan sisi 3: ");
                    double sisi3 = input.nextDouble();
                    /*Buat objek Segitiga dan simpan ke dalam array.*/
                    arrBangunDatar[i] = new Segitiga(sisi1, sisi2, sisi3);
                    break;
                case 3:
                    /*Jika pilihan adalah 3 (Lingkaran), minta input jari-jari.*/
                    System.out.print("Masukkan jari-jari: ");
                    double jari2 = input.nextDouble();
                    /*Buat objek Lingkaran dan simpan ke dalam array.*/
                    arrBangunDatar[i] = new Lingkaran(jari2);
                    break;
                default:
                    /*Jika pilihan tidak valid, cetak pesan kesalahan dan 
                    kurangi nilai i agar pengulangan diulang.*/
                    System.out.println("Pilihan tidak tersedia");
                    i--;
                    break;
            }
        }

        System.out.println("==============================================================");
        System.out.println("No. Bangun datar Keliling Luas");
        System.out.println("--------------------------------------------------------------");
        /*Menggunakan perulangan for untuk mencetak informasi keliling dan luas setiap bangun datar dalam array.*/
        for (int i = 0; i < arrBangunDatar.length; i++) {
            System.out.printf("%2d. %s %10.2f %10.2f\n", i+1, arrBangunDatar[i].getNama(),
            arrBangunDatar[i].hitungKeliling(), arrBangunDatar[i].hitungLuas());
        }

        System.out.println("--------------------------------------------------------------");
    }
}



