/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_6;
import java.util.Scanner;
public class SegitigaMain {
    public static void main(String[] args) {
        // membentuk array dari dua segitiga
        Segitiga[] segitigaArray = new Segitiga[2];

        // mengisi data segitiga pertama
        Segitiga seg1 = new Segitiga();
        seg1.x1 = 1;
        seg1.y1 = 2;
        seg1.x2 = 7;
        seg1.y2 = 2;
        seg1.x3 = 7;
        seg1.y3 = 9;
        segitigaArray[0] = seg1;

        // mengisi data segitiga kedua
        Segitiga seg2 = new Segitiga();
        seg2.x1 = 0;
        seg2.y1 = 0;
        seg2.x2 = 5;
        seg2.y2 = 4;
        seg2.x3 = 8;
        seg2.y3 = 2;
        segitigaArray[1] = seg2;

        // membuat objek kumpulan segitiga
        KumpulanSegitiga kumpulanSegitiga = new KumpulanSegitiga(segitigaArray);
        // mencari rata-rata luas segitiga
        double rataLuas = kumpulanSegitiga.hitungRataRataLuas();
        System.out.println("Rata-rata luas segitiga dalam kumpulan: " + rataLuas);

        // mencari segitiga terluas
        Segitiga segTerluas = kumpulanSegitiga.cariSegitigaTerluas();
        System.out.println("Segitiga terluas dalam kumpulan: "
                + "(" + segTerluas.x1 + "," + segTerluas.y1 + ")"
                + "(" + segTerluas.x2 + "," + segTerluas.y2 + ")"
                + "(" + segTerluas.x3 + "," + segTerluas.y3 + ")");

        // mencari segitiga berukuran paling kecil
        Segitiga segTerkecil = kumpulanSegitiga.cariSegitigaTerkecil();
        System.out.println("Segitiga berukuran paling kecil dalam kumpulan: "
                + "(" + segTerkecil.x1 + "," + segTerkecil.y1 + ")"
                + "(" + segTerkecil.x2 + "," + segTerkecil.y2 + ")"
                + "(" + segTerkecil.x3 + "," + segTerkecil.y3 + ")");
    }
}




