package Modul_9;
public class Honorer extends Pegawai { /*Program ini mendefinisikan kelas 
Honorer yang merupakan turunan dari kelas Pegawai.*/
    /*merupakan variabel bertipe double yang digunakan untuk menyimpan 
    nilai lembur pegawai.*/
    private double lemburan;
    
    /*Method getter getLembur() digunakan untuk mengembalikan nilai lembur 
    (lemburan) pada objek Honorer.*/
    double getLembur() {
        return lemburan;
    }
    /*Method setter setLembur(double myLembur) digunakan untuk mengatur nilai
    lembur (lemburan) pada objek Honorer sesuai dengan nilai yang diberikan 
    pada parameter myLembur.*/
    void setLembur(double myLembur) {
        lemburan = myLembur;
    }
    /*Method hitungGaTot() merupakan override dari method abstrak hitungGaTot()
    yang didefinisikan di kelas Pegawai. Method ini menghitung total gaji 
    (hitungGaTot()) untuk objek Honorer dengan menjumlahkan gaji pokok 
    (getGapok()) dan lembur (lemburan).*/
    @Override
    double hitungGaTot() {
        return getGapok() + lemburan;
    }
    /*Method getTunjangan() merupakan override dari method abstrak 
    getTunjangan() yang didefinisikan di kelas Pegawai. Method ini 
    mengembalikan total tunjangan (getTunjangan()) untuk objek Honorer, 
    dalam hal ini hanya lembur (lemburan).*/
    @Override
    double getTunjangan() {
        return lemburan;
    }
    /*Method getStatus() merupakan override dari method abstrak getStatus() 
    yang didefinisikan di kelas Pegawai. Method ini mengembalikan status 
    pegawai (getStatus()) untuk objek Honorer, dalam hal ini "Honorer".*/
    @Override
    String getStatus() {
        return "Honorer";
    
    }
}

