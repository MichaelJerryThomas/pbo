package Modul_7;
import java.util.Scanner;//membuat perintah untuk scanner
/*Sebuah class bernama Karyawan yang memiliki beberapa atribut seperti npp, nama, dan jumlahAnak. Selain itu, 
terdapat juga atribut static subsidiPerAnak yang bernilai 100000.*/
abstract class Karyawan {
    private int npp;
    private String nama;
    private int jumlahAnak;
    public static int subsidiPerAnak = 100000;
    
    /*Konstruktor class "Karyawan" yang memiliki tiga parameter yaitu npp, nama, dan jumlahAnak.*/
    public Karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }

    /*Program ini adalah sebuah method yang bernama "hitungTunjanganAnak" yang digunakan untuk menghitung besarnya 
    tunjangan anak yang akan diterima oleh seorang karyawan Method ini akan mengalikan jumlah anak yang dimiliki 
    oleh seorang karyawan dengan nilai subsidi per anak yang bersifat statis.*/
    public int hitungTunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }

    /*Program ini adalah dua method yang bersifat abstract yaitu "hitungGajiTotal" dan "hitungUpahTotal"
    Kedua method ini merupakan bagian penting dalam perhitungan gaji dan upah seorang karyawan*/
    public abstract int hitungGajiTotal();
    public abstract int hitungUpahTotal();

    /*Sebuah method yang bernama "displayData" yang digunakan untuk menampilkan data seorang karyawan yang telah diisi melalui konstruktor
    Method ini akan menampilkan NPP, nama, dan jumlah anak dari seorang karyawan dengan menggunakan perintah "System.out.println".*/
    public void displayData() {
        System.out.println("NPP        : " + npp);
        System.out.println("Nama       : " + nama);
        System.out.println("Jumlah Anak: " + jumlahAnak);
    }
}


