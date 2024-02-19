package Modul_7;
/*sebuah class class KaryawanKontrak yang merupakan subclass dari class Karyawan*/
class KaryawanKontrak extends Karyawan {
    /* Class ini memiliki atribut-atribut yang dimiliki oleh class KaryawanKontrak yaitu upahHarian dan jumlahHariMasuk.*/
    private int upahHarian;
    private int jumlahHariMasuk;
    
/*Membuat konstruktor class KaryawanKontrak yang digunakan untuk menginisialisasi atribut-atribut dari 
class KaryawanKontrak. Konstruktor ini memiliki parameter yang berisi npp, nama, jumlahAnak, upahHarian, dan jumlahHariMasuk 
Konstruktor ini juga memanggil konstruktor dari superclass Karyawan menggunakan keyword "super" untuk menginisialisasi 
atribut-atribut dari superclass*/
    public KaryawanKontrak(int npp, String nama, int jumlahAnak, int upahHarian, int jumlahHariMasuk) {
        super(npp, nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    /*Membuat method get dan set yang digunakan untuk mengakses dan mengubah nilai dari atribut khusus class KaryawanKontrak, 
    yaitu upahHarian dan jumlahHariMasuk.Method "get" digunakan untuk mengambil nilai dari atribut tersebut, sedangkan method "set" 
    digunakan untuk mengubah nilai dari atribut tersebut.*/
    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    /*method override dari method hitungUpahTotal() pada class Karyawan yang digunakan untuk menghitung upah total 
    seorang karyawan kontrak Method ini menggunakan atribut khusus class KaryawanKontrak yaitu upahHarian dan jumlahHariMasuk 
    untuk menghitung upah dasar.*/
    @Override
    public int hitungUpahTotal() {
        return (upahHarian * jumlahHariMasuk) + hitungTunjanganAnak();
    }

    /*Program ini adalah method yang digunakan untuk menampilkan informasi data seorang karyawan kontrak,termasuk 
    informasi khusus class KaryawanKontrak yaitu upahHarian dan jumlahHariMasuk.Method ini menggunakan method displayData() 
    pada superclass Karyawan untuk menampilkan informasi umum tentang seorang karyawan,kemudian menampilkan informasi 
    khusus class KaryawanKontrak yaitu upahHarian, jumlahHariMasuk, dan upah total yang dihitung menggunakan method hitungUpahTotal()*/
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Upah Harian : " + upahHarian);
        System.out.println("Jumlah Hari Masuk : " + jumlahHariMasuk);
        System.out.println("Upah Total : " + hitungUpahTotal());
    }

    @Override
    public int hitungGajiTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


