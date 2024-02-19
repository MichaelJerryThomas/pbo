package Modul_7;
/*Sebuah kelas bernama "MahasiswaS2" yang juga merupakan subclass dari kelas "Mahasiswa"*/
class MahasiswaS2 extends Mahasiswa {
    /*Membuat kelas "MahasiswaS2" memiliki konstruktor yang sama dengan konstruktor
    pada kelas Mahasiswa. Konstruktor ini menerima empat parameter, yaitu nama, nim, nilaiUts, 
    dan nilaiUas. Konstruktor ini memanggil konstruktor dari kelas induk (super()) 
    dan meneruskan parameter yang diterima ke dalam konstruktor kelas induk*/
    public MahasiswaS2(String nama, String nim, double nilaiUts, double nilaiUas) {
        super(nama, nim, nilaiUts, nilaiUas);
    }
    /*Sebuah Method Override yang mengekstend hitungNilaiFinal() di sini merupakan overriding method dari metode serupa pada kelas induk. 
    Method ini akan menghitung nilai final berdasarkan bobot yang telah ditentukan,kemudian akan mengembalikan nilai huruf 
    berdasarkan rentang skor tertentu. Karena ini merupakan kelas turunan, skala penilaian bisa berbeda dengan kelas induk.*/
    @Override
    public String hitungNilaiFinal() {
        double skorFinal = 0.4 * this.nilaiUts + 0.6 * this.nilaiUas;

        if (skorFinal >= 85) {
            return "A";
        } else if (skorFinal >= 70 && skorFinal < 85) {
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



