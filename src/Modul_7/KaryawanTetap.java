package Modul_7;
/*class yang merupakan subclass dari class Karyawan*/
class KaryawanTetap extends Karyawan {
    /*Class ini memiliki atribut pada class KaryawanTetap yang merepresentasikan gaji pokok seorang karyawan tetap*/
    private int gajiPokok;

    /*Membuat constructor pada class KaryawanTetap yang digunakan untuk menginisialisasi nilai dari atribut npp, nama, jumlahAnak 
    dan gajiPokok pada objek yang dibuat. Constructor ini memanggil constructor superclass Karyawan dengan menggunakan keyword "super"*/
    public KaryawanTetap(int npp, String nama, int jumlahAnak, int gajiPokok) {
        super(npp, nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }
    /*Membuat sebuah method override pada class KaryawanTetap yang menghitung total gaji seorang karyawan tetap dengan menjumlahkan gaji pokok 
    dan tunjangan anak yang diterima. Method ini mengimplementasikan method abstract hitungGajiTotal() yang didefinisikan pada superclass Karyawan*/
    @Override
    public int hitungGajiTotal() {
        return gajiPokok + hitungTunjanganAnak();
    }
    /*Method ini adalah method override pada class KaryawanTetap yang menghitung total upah seorang karyawan tetap
    Karena karyawan tetap tidak dihitung berdasarkan upah harian dan jumlah hari masuk, maka method ini mengembalikan nilai 0*/
    @Override
    public int hitungUpahTotal() {
        return 0;
    }

    /*Membuat sebuah method displayGajiTotal() digunakan untuk menampilkan informasi gaji total dari karyawan tetap*/
    public void displayGajiTotal() {
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }
}




