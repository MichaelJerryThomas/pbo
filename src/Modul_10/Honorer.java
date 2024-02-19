package Modul_10;

public class Honorer extends Pegawai {/*Deklarasi kelas "Honorer" yang merupakan turunan dari kelas "Pegawai". 
Kelas "Honorer" mewarisi semua atribut dan metode dari kelas "Pegawai".*/

    /*Deklarasi atribut "lemburan" yang bertipe data double dan atribut "email" yang bertipe data String. 
    Atribut "lemburan" digunakan untuk menyimpan nilai lembur honorer, sedangkan atribut "email" digunakan 
    untuk menyimpan alamat email honorer. Diikuti dengan metode "getLembur()" yang mengembalikan nilai atribut "lemburan".*/
    private double lemburan;
    private String email = "@honorer.usd.ac.id";
    
    double getLembur() {
        return lemburan;
    }

    /*Metode "setLembur()" digunakan untuk mengatur nilai atribut "lemburan" dengan nilai yang diberikan.*/
    void setLembur(double myLembur) {
        lemburan = myLembur;
    }

    /*Implementasi metode-metode abstrak yang didefinisikan dalam kelas "Pegawai". Metode "hitungGaTot()" mengembalikan total 
    gaji honorer yang merupakan penjumlahan gaji pokok dan lemburan. Metode "getTunjangan()" mengembalikan nilai tunjangan 
    yang diterima honorer, dalam hal ini hanya nilai lemburan. Metode "getStatus()" mengembalikan status pegawai sebagai "Honorer".*/
    @Override
    double hitungGaTot() {
        return getGapok() + lemburan;
    }

    @Override
    double getTunjangan() {
        return lemburan;
    }

    @Override
    String getStatus() {
        return "Honorer";

    }

    /*Metode "getEmail()" mengimplementasikan metode dari antarmuka "Email". Metode ini menghasilkan alamat email honorer dengan
    menggabungkan nomor pegawai dengan alamat email yang sudah ditentukan.*/
    public String getEmail() {
        email = getNpp() + email;
        return email;
    }
}


