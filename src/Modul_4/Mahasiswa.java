package Modul_4;
public class Mahasiswa {
    //deklarasi variabel yang akan digunakan dalam class Mahasiswa variabel-variabel tersebut adalah nim, nama, tanggalLahir, uts1, uts2, dan uas
    private String nim,nama,tanggalLahir;
    private double uts1,uts2,uas;
    //membuat constructor class Mahasiswa yang menerima tiga parameter yaitu nim, nama, dan tanggalLahir
    public Mahasiswa(String nim, String nama, String tanggalLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel nim
    public String getNim() {
        return nim;
    }
    //membuat method yang digunakan untuk mengubah nilai dari variabel nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel nama
    public String getNama() {
        return nama;
    }
    //membuat method yang digunakan untuk mengubah nilai dari variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel tanggalLahir
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    //membuat method yang digunakan untuk mengubah nilai dari variabel tanggalLahir
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel uts1
    public double getUts1() {
        return uts1;
    }
    //membuat method yang digunakan untuk mengubah nilai dari variabel uts1
    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel uts2.
    public double getUts2() {
        return uts2;
    }
    //membuat method yang digunakan untuk mengubah nilai dari variabel uts2
    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }
    //membuat method yang digunakan untuk mengambil nilai dari variabel uas
    public double getUas() {
        return uas;
    }
    //method yang digunakan untuk mengubah nilai dari variabel uas
    public void setUas(double uas) {
        this.uas = uas;
    }
    //method yang digunakan untuk menghitung nilai akhir mahasiswa dengan mengambil nilai uts1, 
    //uts2, dan uas serta menghitung dengan bobot 0.3, 0.3, dan 0.4 secara berurutan
    public double NilaiFinal(){
        double Final = (0.3 * getUts1()) + (0.3 * getUts2()) + (0.4 * getUas());
        return Final; 
    }
    //method yang digunakan untuk mengkonversi nilai akhir mahasiswa ke dalam bentuk huruf
    //Method ini mengambil nilai akhir mahasiswa dengan memanggil method NilaiFinal() dan melakukan 
    //konversi ke dalam bentuk huruf dengan menggunakan struktur kontrol percabangan if-else
    public String Konversi(){
        String nilai = null;
        if (NilaiFinal() >= 80) {
                nilai = "A";
            } else if (NilaiFinal() >= 70 && NilaiFinal() < 80) {
                nilai = "B";
            } else if (NilaiFinal() >= 56 && NilaiFinal() < 70){
                nilai = "c";
            } else if (NilaiFinal() >= 45 && NilaiFinal() < 56) {
                nilai = "D";
            } else if (NilaiFinal() < 45) {
                nilai = "E";
            }
        return nilai;
    }
}
