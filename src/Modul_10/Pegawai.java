package Modul_10;
    /*Deklarasi kelas bernama "Pegawai" yang dideklarasikan dengan kata kunci "abstract". 
    Kelas ini mengimplementasikan antarmuka "Email". Sebagai kelas abstrak, "Pegawai" tidak 
    dapat diinstansiasi, tetapi dapat diwarisi oleh kelas-kelas turunannya.*/
    public abstract class Pegawai implements Email{
    /*Deklarasi variabel instance private dalam kelas "Pegawai". Variabel ini mewakili 
    atribut-atribut yang terkait dengan seorang pegawai, yaitu "npp" (nomor pegawai), 
    "nama" (nama pegawai), dan "gajiPokok" (gaji pokok pegawai).*/
    private int npp;
    private String nama;
    private double gajiPokok;
    /*Mendefinisikan metode-metode getter dan setter untuk mengakses dan mengubah nilai dari variabel 
    instance "npp", "nama", dan "gajiPokok" dalam kelas "Pegawai". Metode getter digunakan untuk 
    mengembalikan nilai dari variabel, sedangkan metode setter digunakan untuk mengatur nilai variabel.*/
    int getNpp() {
        return npp;
    }

    String getNama() {
        return nama;
    }

    double getGapok() {
        return gajiPokok;
    }

    void setNpp(int nopeg) {
        npp = nopeg;
    }

    void setNama(String nampeg) {
        nama = nampeg;
    }

    void setGapok(double upah) {
        gajiPokok = upah;
    }
    /*Mendefinisikan metode-metode setter dan getter tambahan yang tidak memiliki implementasi saat ini. 
    Metode-metode ini mungkin digunakan untuk mengatur dan mendapatkan nilai-nilai terkait dengan lembur, 
    tunjangan jabatan, dan bonus. Namun, saat ini metode-metode ini hanya mengembalikan nilai default 0.*/
    void setLembur(double overTime) {
    }

    void setTunJab(double honJab) {
    }

    void setBonus(double myBonus) {
    }

    double getTunjab() {
        return 0;
    }

    double getLembur() {
        return 0;
    }

    double getBonus() {
        return 0;
    }
    /*Deklarasi metode-metode abstrak dalam kelas "Pegawai". Metode-metode ini tidak memiliki implementasi 
    di kelas ini dan akan diimplementasikan oleh kelas-kelas turunan. Metode "getStatus()" mengembalikan 
    status pegawai, metode "getTunjangan()" mengembalikan nilai tunjangan yang diterima pegawai, dan 
    metode "hitungGaTot()" digunakan untuk menghitung total gaji peg.*/
    abstract String getStatus();

    abstract double getTunjangan();

    abstract double hitungGaTot();
    }



