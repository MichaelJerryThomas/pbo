package Modul_10;
    /*Mendefinisikan kelas bernama "Manajer" yang merupakan turunan dari kelas "Pegawai". Dengan kata kunci "extends", 
    kelas "Manajer" mewarisi semua atribut dan metode yang didefinisikan dalam kelas "Pegawai".*/
    public class Manajer extends Pegawai{
    /*Deklarasi variabel instance private dalam kelas "Manajer". Variabel ini mewakili atribut-atribut yang terkait 
    dengan seorang manajer, yaitu "tunjanganJabatan" (tunjangan jabatan) dan "lemburan" (uang lembur). Variabel "email" 
    digunakan untuk menyimpan alamat email manajer.*/
    private double tunjanganJabatan, lemburan;
    private String email = "@manajer.usd.ac.id";
    /*Mendefinisikan metode-metode getter dan setter tambahan yang berfungsi untuk mengakses dan mengubah nilai dari variabel 
    instance "tunjanganJabatan" dan "lemburan" dalam kelas "Manajer". Metode getter digunakan untuk mengembalikan 
    nilai dari variabel, sedangkan metode setter digunakan untuk mengatur nilai variabel.*/
    double getTunJab() {
        return tunjanganJabatan;
    }

    double getLembur() {
        return lemburan;
    }

    void setTunJab(double honJab) {
        tunjanganJabatan = honJab;
    }

    void setLembur(double overtime) {
        lemburan = overtime;
    }

    /*Implementasi metode-metode abstrak yang diwarisi dari kelas "Pegawai". Metode "hitungGaTot()" 
    digunakan untuk menghitung total gaji manajer, yaitu gaji pokok ditambah tunjangan jabatan dan uang lembur. 
    Metode "getTunjangan()" mengembalikan nilai total tunjangan yang diterima manajer, yaitu tunjangan jabatan 
    ditambah uang lembur. Metode "getStatus()" mengembalikan status pegawai sebagai "Manajer".*/
    double hitungGaTot() {
        return getGapok() + tunjanganJabatan + lemburan;
    }

 
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }

 
    String getStatus() {
        return "Manajer";
    }
    /*Implementasi metode "getEmail()" dari antarmuka "Email" yang diimplementasikan oleh kelas "Pegawai". 
    Metode ini digunakan untuk menghasilkan alamat email manajer dengan menggabungkan nomor pegawai (npp) 
    dengan alamat email default "@manajer.usd.ac.id".*/
    public String getEmail() {
        email = getNpp()+email;
        return email;
    }
 }  



