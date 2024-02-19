package Modul_7;
/*Membuat sebuah kelas bernama "MahasiswaS1" yang merupakan subclass dari kelas "Mahasiswa"*/
public class MahasiswaS1 extends Mahasiswa {
    /*Konstruktor kelas MahasiswaS1 yang merupakan turunan dari kelas Mahasiswa. 
    Konstruktor ini menerima empat parameter, yaitu nama, nim, nilaiUts, dan nilaiUas. 
    Konstruktor ini juga memanggil konstruktor dari kelas induk (super()) dan meneruskan parameter 
    yang diterima ke dalam konstruktor kelas induk.Dengan begitu, objek MahasiswaS1 akan memiliki 
    atribut-atribut yang sama seperti objek Mahasiswa*/
    public MahasiswaS1(String nama, String nim, double nilaiUts, double nilaiUas) {
        super(nama, nim, nilaiUts, nilaiUas);
    }
    /*Merupakan method override yang mengekstend metode hitungNilaiFinal() dari kelas induk Mahasiswa 
    untuk menghitung nilai akhir dari mahasiswa S1 dengan menggunakan bobot nilai UTS sebesar 40% dan nilai UAS sebesar 60%. 
    Method ini mengembalikan nilai huruf (A, B, C, D, atau E) berdasarkan skor akhir yang dihitung*/
    @Override
    public String hitungNilaiFinal() {
        double skorFinal = 0.4 * this.nilaiUts + 0.6 * this.nilaiUas;

        if (skorFinal >= 80) {
            return "A";
        } else if (skorFinal >= 70 && skorFinal < 80) {
            return "B";
        } else if (skorFinal >= 56 && skorFinal < 70) {
            return "C";
        } else if (skorFinal >= 45 && skorFinal < 56) {
            return "D";
        } else {
            return "E";
        }
    }
}



