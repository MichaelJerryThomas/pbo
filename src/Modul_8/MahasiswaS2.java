package Modul_8;/*membuat package bernama Modul_8.*/

public class MahasiswaS2 extends Mahasiswa{/*mendefinisikan kelas MahasiswaS2 dan mendeklarasikan bahwa 
kelas MahasiswaS2 merupakan turunan dari kelas Mahasiswa.Dalam hal ini, kelas MahasiswaS2 mewarisi semua 
atribut dan metode yang dimiliki oleh kelas Mahasiswa.*/
    public MahasiswaS2(){}/*mendefinisikan constructor default atau tanpa parameter untuk kelas MahasiswaS2.*/
    
    @Override/*annotation yang menandakan bahwa method hitungNilaiFinal() akan menimpa atau meng-override 
    method dengan nama yang sama pada superclass-nya (kelas Mahasiswa).*/
    public char  hitungNilaiFinal (){/*mendefinisikan method hitungNilaiFinal() yang menghitung nilai final 
    dari mahasiswa S2 dan mengembalikan nilai rating berupa karakter.*/
        char rating;/*mendeklarasikan variabel rating bertipe karakter untuk menampung nilai rating mahasiswa.*/
        double nilaiFinal = hitungNilai();/*mendeklarasikan variabel nilaiFinal bertipe double dan memberinya 
        nilai dengan memanggil method hitungNilai() yang terdapat di kelas Mahasiswa.*/
        
    /*Kolom ini menggunakan struktur kontrol if-else untuk menentukan nilai rating berdasarkan nilaiFinal mahasiswa S2. 
    Jika nilaiFinal di atas atau sama dengan 85, rating diisi dengan 'A', jika di antara 70 dan 85, rating diisi 
    dengan 'B', dan seterusnya.*/
        if (nilaiFinal >= 85) {
            rating = 'A';
        }
        else if (nilaiFinal >= 70 && nilaiFinal < 85) {
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
        return rating;/*mengembalikan nilai rating dari mahasiswa S2 yang telah dihitung.*/
    }
}

