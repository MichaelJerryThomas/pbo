package Modul_9;
public class Pemasaran extends Pegawai{ /*Program ini mendefinisikan kelas 
Pemasaran yang merupakan turunan dari kelas Pegawai.*/
    
    private double bonus; /*Mendeklarasikan variabel private bonus yang 
    digunakan untuk menyimpan nilai bonus untuk pegawai di bidang pemasaran.*/
    
    /*Method getter getBonus() digunakan untuk mengembalikan nilai bonus 
    (bonus) pada objek Pemasaran.*/
    double getBonus() {
        return bonus;
    }
    /*Method setter setBonus(double myBonus) digunakan untuk mengatur nilai 
    bonus (bonus) pada objek Pemasaran sesuai dengan nilai yang diberikan 
    pada parameter myBonus.*/
    void setBonus(double myBonus){
        bonus = myBonus;
    } 
    /*Method hitungGaTot() merupakan override dari method abstrak hitungGaTot() 
    yang didefinisikan di kelas Pegawai. Method ini menghitung total gaji 
    (hitungGaTot()) untuk objek Pemasaran dengan menjumlahkan gaji pokok 
    (getGapok()) dan bonus (bonus).*/
    @Override
    double hitungGaTot(){
        return getGapok()+bonus;
    }
    /*Method getTunjangan() merupakan override dari method abstrak 
    getTunjangan() yang didefinisikan di kelas Pegawai. Method ini 
    mengembalikan total tunjangan (getTunjangan()) untuk objek Pemasaran, 
    dalam hal ini hanya bonus (bonus).*/
    @Override
    double getTunjangan() {
        return bonus;
    }
    /*Method getStatus() merupakan override dari method abstrak getStatus() 
    yang didefinisikan di kelas Pegawai. Method ini mengembalikan status 
    pegawai (getStatus()) untuk objek Pemasaran, dalam hal ini "Pemasaran".*/
    @Override
    String getStatus() { return "Pemasaran"; }
    }



