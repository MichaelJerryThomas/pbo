package Modul_8;/*membuat package bernama Modul_8.*/ 

public class MahasiswaS1 extends Mahasiswa{/*Kolom ini mendefinisikan kelas MahasiswaS1 dan 
 mendeklarasikan bahwa kelas MahasiswaS1 merupakan turunan dari kelas Mahasiswa. Dalam hal ini, 
 kelas MahasiswaS1 mewarisi semua atribut dan metode yang dimiliki oleh kelas Mahasiswa.*/
    
    public MahasiswaS1(){}/*Mendefinisikan constructor default atau tanpa parameter untuk 
    kelas MahasiswaS1. Dalam hal ini,constructor tidak melakukan apa-apa.*/

    public char  hitungNilaiFinal (){/*mendefinisikan method hitungNilaiFinal() yang menghitung 
    nilai final dari mahasiswa S1 dan mengembalikan nilai rating berupa karakter.*/
        char rating;/*mendeklarasikan variabel rating bertipe karakter untuk menampung nilai rating mahasiswa.*/
        double nilaiFinal = hitungNilai();/*mendeklarasikan variabel nilaiFinal bertipe double dan memberinya 
        nilai dengan memanggil method hitungNilai() yang terdapat di kelas Mahasiswa.*/
        
        /*menggunakan struktur kontrol if-else untuk menentukan nilai rating berdasarkan nilaiFinal mahasiswa S1. 
        Jika nilaiFinal di atas atau sama dengan 80, rating diisi dengan 'A', jika di antara 70 dan 80, rating 
        diisi dengan 'B', dan seterusnya.*/
        if (nilaiFinal >= 80) {
            rating = 'A';
        }
        else if (nilaiFinal >= 70 && nilaiFinal < 80) {
            rating = 'B';
        }
        else if (nilaiFinal >= 56 && nilaiFinal < 70) {
            rating = 'C';
        }
        else if (nilaiFinal >= 45 && nilaiFinal < 56) {
            rating = 'D';
        }
        else if (nilaiFinal < 45) {
            rating = 'E';
        }
        else{
            rating = '0';
        }
        return rating;/*mengembalikan nilai rating dari mahasiswa S1 yang telah dihitung.*/
    }
}

