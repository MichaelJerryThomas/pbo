package Modul_8;/*membuat package bernama Modul_8.*/ 
/*membuat kelas Java bernama "Mahasiswa".*/
class Mahasiswa {

    /*variabel instance yang menyimpan nim, nama, dan tanggal lahir dari mahasiswa. 
    Atribut ini bersifat private, sehingga hanya dapat diakses oleh objek dari kelas itu sendiri.*/
    private String nim, nama, tglLahir;
    
    /*variabel instance yang menyimpan nilai UTS1, UTS2, dan UAS dari mahasiswa. 
    //Atribut ini bersifat private, sehingga hanya dapat diakses oleh objek dari kelas itu sendiri.*/
    private double uts1, uts2, uas;

    /*konstruktor tanpa parameter pada kelas "Mahasiswa".Konstruktor ini bersifat protected, 
    sehingga hanya dapat diakses oleh kelas yang merupakan subclass dari "Mahasiswa".*/
    protected Mahasiswa() {
    }
    
    /*sebuah method yang digunakan untuk mengisi nilai atribut nama pada objek dari kelas "Mahasiswa".*/
    public void setNama(String nama) {
        this.nama = nama;
    }

    /*sebuah method yang digunakan untuk mengisi nilai atribut nim pada objek dari kelas "Mahasiswa".*/
    public void setNim(String nim) {
        this.nim = nim;
    }

    /*sebuah method yang digunakan untuk mengisi nilai atribut tglLahir pada objek dari kelas "Mahasiswa".*/
    public void setTgl(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    /*sebuah method yang digunakan untuk mengisi nilai atribut uts1 pada objek dari kelas "Mahasiswa".*/
    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    /*sebuah method yang digunakan untuk mengisi nilai atribut uts2 pada objek dari kelas "Mahasiswa".*/
    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    /*sebuah method yang digunakan untuk mengisi nilai atribut uas pada objek dari kelas "Mahasiswa".*/
    public void setUas(double uas) {
        this.uas = uas;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut nama dari objek dari kelas "Mahasiswa".*/
    public String getNama() {
        return nama;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut nim dari objek dari kelas "Mahasiswa".*/
    public String getNim() {
        return nim;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut tglLahir dari objek dari kelas "Mahasiswa".*/
    public String getTgl() {
        return tglLahir;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut uts1 dari objek dari kelas "Mahasiswa".*/
    public double getUts1() {
        return uts1;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut uts2 dari objek dari kelas "Mahasiswa".*/
    public double getUts2() {
        return uts2;
    }

    /*sebuah method yang digunakan untuk mengembalikan nilai atribut uas dari objek dari kelas "Mahasiswa".*/
    public double getUas() {
        return uas;
    }

    /*sebuah method yang digunakan untuk menghitung nilai akhir mahasiswa berdasarkan nilai UTS1, UTS2, dan UAS. 
    Method ini mengembalikan nilai double berupa nilai akhir mahasiswa.*/
    public double hitungNilai() {
        double nilaiFinal;

        nilaiFinal = ((uts1 * 30 / 100) + (uts2 * 30 / 100) + (uas * 40 / 100));
        return nilaiFinal;

    }

    /*menghitung nilai akhir mahasiswa dan menentukan rating nilai berdasarkan skala nilai yang ditentukan.*/
    public char hitungNilaiFinal() {
        char rating;
        double nilaiFinal = hitungNilai();

        if (nilaiFinal >= 80) {
            rating = 'A';
        } else if (nilaiFinal >= 70 && nilaiFinal < 80) {
            rating = 'B';
        } else if (nilaiFinal >= 56 && nilaiFinal < 70) {
            rating = 'C';
        } else if (nilaiFinal >= 45 && nilaiFinal < 56) {
            rating = 'D';
        } else if (nilaiFinal < 45) {
            rating = 'E';
        } else {
            rating = '0';
        }
        return rating;
    }

    /*untuk mencari indeks mahasiswa dengan nilai tertinggi di dalam array Mahasiswa. Metode ini menerima
    parameter berupa array Mahasiswa dan mengembalikan nilai berupa indeks dari mahasiswa dengan nilai 
    tertinggi di dalam array. Metode ini melakukan pencarian dengan menggunakan perulangan for dan 
    membandingkan setiap nilai dengan nilai tertinggi saat ini. Jika nilai mahasiswa yang sedang diperiksa
    lebih besar dari nilai tertinggi saat ini,maka nilai tertinggi akan diupdate dan indeks mahasiswa 
    dengan nilai tertinggi akan disimpan. Akhirnya, metode ini akan mengembalikan indeks dari mahasiswa 
    dengan nilai tertinggi di dalam array.*/
    public static int tertinggi(Mahasiswa[] mhs) {
        int tinggi = 0;
        double max = mhs[0].hitungNilai();
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].hitungNilai() > max) {
                max = mhs[i].hitungNilai();
                tinggi = i;
            }
        }

        return tinggi;
    }
}


