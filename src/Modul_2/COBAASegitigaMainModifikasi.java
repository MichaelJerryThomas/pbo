/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_2;

/**
 *
 * @author HP
 */
public class COBAASegitigaMainModifikasi {
    public static void main(String[] args) {
        // membentuk obyek segi dari class Segitiga
        COBAASegitigaModifikasi seg1 = new COBAASegitigaModifikasi (1, 2, 7, 2, 7, 9 );
        //menghitung & menampilkan luas segitiga
        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan (7,9) adalah :" + seg1.hitungLuas ());
        
        //membentuk obyek seg2 dari class Segitiga
        COBAASegitigaModifikasi seg2 = new COBAASegitigaModifikasi (0, 0, 5, 4, 9, 2);
        //menghitung & menampilkan luas segitiga
        System.out.println("Luas segitiga dengan titik (0,0) (5,4) dan (8,2) adalah :" + seg2.hitungLuas ());
    }
}
