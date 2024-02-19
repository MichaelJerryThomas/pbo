package Modul_9;
public class Manajer extends Pegawai{ /*mendefinisikan kelas Manajer yang 
merupakan turunan dari kelas Pegawai.*/
    
    private double tunjanganJabatan, lemburan;/*Mendeklarasikan dua variabel 
    private yaitu tunjanganJabatan dan lemburan yang merupakan tunjangan 
    jabatan dan lembur untuk manajer.*/
 
    /*Method getter getTunJab() digunakan untuk mengembalikan nilai tunjangan 
    jabatan (tunjanganJabatan) pada objek Manajer.*/
    double getTunJab() {
        return tunjanganJabatan;
    }
    /*Method getter getLembur() digunakan untuk mengembalikan nilai lembur 
    (lemburan) pada objek Manajer.*/
    double getLembur() {
        return lemburan;
    }
    /*Method setter setTunJab(double honJab) digunakan untuk mengatur nilai 
    tunjangan jabatan (tunjanganJabatan) pada objek Manajer sesuai dengan 
    nilai yang diberikan pada parameter honJab.*/
    void setTunJab(double honJab) {
        tunjanganJabatan = honJab;
    }
    /*Method setter setLembur(double overtime) digunakan untuk mengatur nilai
    lembur (lemburan) pada objek Manajer sesuai dengan nilai yang diberikan 
    pada parameter overtime.*/
    void setLembur(double overtime) {
        lemburan = overtime;
    }

    /*Method hitungGaTot() merupakan override dari method abstrak hitungGaTot()
    yang didefinisikan di kelas Pegawai. Method ini menghitung total gaji 
   (hitungGaTot()) untuk objek Manajer dengan menjumlahkan gaji pokok 
   (getGapok()), tunjangan jabatan (tunjanganJabatan), dan lembur (lemburan).*/
    @Override
    double hitungGaTot() {
        return getGapok() + tunjanganJabatan + lemburan;
    }

    /*Method getTunjangan() merupakan override dari method abstrak 
    getTunjangan() yang didefinisikan di kelas Pegawai. Method ini 
    mengembalikan total tunjangan (getTunjangan()) untuk objek Manajer dengan
    menjumlahkan tunjangan jabatan (tunjanganJabatan) dan lembur (lemburan).*/
    @Override
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }

    /*Method getStatus() merupakan override dari method abstrak getStatus() 
    yang didefinisikan di kelas Pegawai. Method ini mengembalikan status 
    pegawai (getStatus()) untuk objek Manajer, dalam hal ini "Manajer".*/
    @Override
    String getStatus() {
        return "Manajer";
    }
}


