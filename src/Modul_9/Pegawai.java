package Modul_9;
public abstract class Pegawai { /*mendefinisikan kelas Pegawai yang bersifat
abstrak. Kelas abstrak tidak dapat diinstansiasi, tetapi hanya digunakan 
sebagai kerangka dasar untuk kelas turunannya.*/
    
    private int npp; /* Variabel private yang menyimpan nomor pegawai.*/
    private String nama; /*Variabel private yang menyimpan nama pegawai.*/
    private double gajiPokok; /*Variabel private yang menyimpan gaji pokok 
    pegawai.*/

    /*Method getter yang mengembalikan nilai npp (nomor pegawai).*/
    int getNpp() { 
        return npp;
    }
    /*Method getter yang mengembalikan nilai nama (nama pegawai).*/
    String getNama() {
        return nama;
    }
    /*Method getter yang mengembalikan nilai gajiPokok (gaji pokok pegawai).*/
    double getGapok() {
        return gajiPokok;
    }
    /*Method setter yang mengatur nilai npp (nomor pegawai) sesuai dengan 
    parameter nopeg.*/
    void setNpp(int nopeg) {
        npp = nopeg;
    }
    /*Method setter yang mengatur nilai nama (nama pegawai) sesuai dengan 
    parameter nampeg.*/
    void setNama(String nampeg) {
        nama = nampeg;
    }
    /*Method setter yang mengatur nilai gajiPokok (gaji pokok pegawai) sesuai 
    dengan parameter upah.*/
    void setGapok(double upah) {
        gajiPokok = upah;
    }
    /*Method ini bertujuan untuk mengatur nilai lembur pegawai.*/
    void setLembur(double overTime) {
    }
    /*Method ini bertujuan untuk mengatur nilai tunjangan jabatan pegawai.*/
    void setTunJab(double honJab) {
    }
    /*Method ini bertujuan untuk mengatur nilai bonus pegawai.*/
    void setBonus(double myBonus) {
    }
    /*Method getter yang mengembalikan nilai 0. Ini merupakan method yang 
    belum diimplementasikan.*/
    double getTunjab() {
        return 0;
    }
    /*Method getter yang mengembalikan nilai 0. Ini merupakan method yang 
    belum diimplementasikan.*/
    double getLembur() {
        return 0;
    }
    /*Method getter yang mengembalikan nilai 0. Ini merupakan method yang 
    belum diimplementasikan.*/
    double getBonus() {
        return 0;
    }
    /* Method abstrak yang harus diimplementasikan oleh kelas turunan. 
    Method ini mengembalikan status pegawai dalam bentuk String.*/
    abstract String getStatus();
    /*Method abstrak yang harus diimplementasikan oleh kelas turunan. 
    Method ini mengembalikan tunjangan pegawai dalam bentuk double.*/
    abstract double getTunjangan();
    /*Method abstrak yang harus diimplementasikan oleh kelas turunan. 
    Method ini menghitung total gaji pegawai.*/
    abstract double hitungGaTot();
}

