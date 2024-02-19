/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_1;

/**
 *
 * @author HP
 */
public class Mobil {
    String warna ; // deklarasi variabel warna dengan tipe string
    Mobil (String wrn){ // membuat kontruktor dengan dengan parameter wrn bertipe string 
        warna = wrn; // mengisi variabel warna dengan variabel wrn
    }
    void jalan_maju () { // membuat method dengan nama jalan_maju
        System.out.print("Mobil warna" + warna); // menampilkan tulisan "Mobil Warna" lalu menampil isi variabel warna
        System.out.println("Maju !"); // menampilkan tulisan "Maju !"
    }
    public static void main(String[] args)  { // membuat class main utama 
        Mobil sedan = new Mobil ("merah"); // membentuk objek dengan nama sedan dengan parameter merah
        sedan.jalan_maju(); // objek sedan memanggil method jalan_maju
    }
    
}

