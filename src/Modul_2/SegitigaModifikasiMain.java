package Modul_2;
public class SegitigaModifikasiMain {
    public static void main(String[] args) {
        //membentuk obyek seg1 dari class Segitiga dengan konstruktor
        SegitigaModifikasi seg1 = new SegitigaModifikasi(1, 2, 7, 2, 7, 9);

        //menghitung & menampilkan luas segitiga
        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan (7,9) adalah: " + seg1.hitungLuas());

        //membentuk obyek seg2 dari class Segitiga dengan setter
        SegitigaModifikasi seg2 = new SegitigaModifikasi (0, 0, 5, 4, 8, 2);
        seg2.setX1(2); //mengubah koordinat titik

    }
}


