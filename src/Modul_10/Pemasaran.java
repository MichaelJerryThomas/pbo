package Modul_10;
public class Pemasaran extends Pegawai {/*Deklarasi kelas "Pemasaran" yang merupakan turunan dari kelas "Pegawai". 
Kelas "Pemasaran" mewarisi semua atribut dan metode dari kelas "Pegawai".*/

    /*Deklarasi atribut "bonus" yang bertipe data double dan atribut "email" yang bertipe data String. Atribut "bonus" 
   digunakan untuk menyimpan nilai bonus yang diterima oleh pegawai pemasaran, sedangkan atribut "email" digunakan 
   untuk menyimpan alamat email pegawai pemasaran. Diikuti dengan metode "getBonus()" yang mengembalikan nilai atribut "bonus".*/
    private double bonus;
    private String email = "@marketing.usd.ac.id";

    double getBonus() {
        return bonus;
    }

    /*Metode "setBonus()" digunakan untuk mengatur nilai atribut "bonus" dengan nilai yang diberikan sebagai argumen.*/
    void setBonus(double myBonus) {
        bonus = myBonus;
    }

    /*Implementasi metode-metode abstrak yang didefinisikan dalam kelas "Pegawai". Metode "hitungGaTot()" mengembalikan 
    total gaji pegawai pemasaran yang merupakan penjumlahan gaji pokok dan bonus. Metode "getTunjangan()" mengembalikan 
    nilai tunjangan yang diterima pegawai pemasaran, dalam hal ini hanya nilai bonus. Metode "getStatus()" mengembalikan 
    status pegawai sebagai "Pemasaran".*/
    @Override
    double hitungGaTot() {
        return getGapok() + bonus;
    }

    @Override
    double getTunjangan() {
        return bonus;
    }

    @Override
    String getStatus() {
        return "Pemasaran";
    }

    /*Metode "getEmail()" mengimplementasikan metode dari antarmuka "Email". Metode ini menghasilkan alamat email 
    pegawai pemasaran dengan menggabungkan nomor pegawai dengan alamat email yang sudah ditentukan.*/
    public String getEmail() {
        email = getNpp() + email;
        return email;
    }
}



