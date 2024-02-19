/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_1;

/**
 *
 * @author HP
 */
public class Buku {
    private String judul;//memesan variabel judul dengan tipe String yang hanya bisa digunakan untuk class tertentu
    private String pengarang;//memesan variabel pengarang dengan tipe String yang hanya bisa digunakan untuk class tertentu
    private String ISBN;//memesan variabel ISBN dengan tipe String yang hanya bisa digunakan untuk class tertentu
    private String penerbit;//memesan variabel penerbit dengan tipe String yang hanya bisa digunakan untuk class tertentu
    private String kategori;//memesan variabel kategori dengan tipe String yang hanya bisa digunakan untuk class tertentu
    
    Buku(String judul, String ISBN){//membuat konstruktor dengan parameter judul, ISBN
        this.judul=judul;//mengarahkan parameter ke variabel judul yang dibuat diatas
        this.ISBN=ISBN;//mengarahkan parameter ke variabel judul yang dibuat diatas
    }
    public void Dipinjam() {
        System.out.println("Sedang Dipinjam");// mencetak tulisan "sedang dipinjam"
    }
    public void Dikembalikan (){
        System.out.println("Sudah dikembalikan");//mencetak tulisan "sudah dikembalikan"
    }
    public static void main(String [] args){
        Buku book1=new Buku("Struktur Data" , "1304595");//membuat objek dengan parameter judul buku "Struktur Data", dan isbn "1304595"
        book1.Dipinjam();//objek book1 memanggil method Dipinjam
        
        Buku book2=new Buku ("Java Fundamental" , "1304300");//membuat objek dengan parameter judul buku "Java Fundamental", dan isbn "1304300"
        book2.Dikembalikan();//objek book2 memanggil method Dikembalikan
    }
}



