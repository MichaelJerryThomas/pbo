package Modul_7;
/*Sebuah class bernama "Mahasiswa"*/
public class Mahasiswa {
    /*Kelas ini memiliki beberapa atribut yang dimiliki oleh kelas Mahasiswa yaitu nama, nim, nilai UTS, dan nilai UAS. 
    Atribut ini memiliki tingkat akses protected,artinya dapat diakses oleh kelas turunan dan kelas dalam package yang sama.*/
    public String nama;
    protected String nim;
    protected double nilaiUts;
    protected double nilaiUas;

    /*konstruktor dari kelas Mahasiswa yang menerima empat parameter: nama, nim, nilaiUts, dan nilaiUas. 
    Konstruktor digunakan untuk membuat objek Mahasiswa dengan memberi nilai awal pada atribut nama, nim, 
    nilaiUts, dan nilaiUas sesuai dengan nilai parameter yang diberikan.*/
    public Mahasiswa(String nama, String nim, double nilaiUts, double nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    /*Kelas Mahasiswa juga memiliki hitungNilaiFinal() digunakan untuk menghitung nilai akhir mahasiswa dengan menggunakan
    bobot nilai UTS sebesar 40% dan bobot nilai UAS sebesar 60%. Nilai akhir kemudian akan dikonversi menjadi nilai 
    huruf sesuai dengan standar konversi yang telah ditentukan.*/
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



