/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_1;
import java.util.Scanner;
public class BujurSangkarMain {//Deklarasi Class
    public static void main(String[] args) {//Deklarasi Main
        
        BujurSangkar bujur1=new BujurSangkar(); // Membuat objek dengan nama "bujur1"
        BujurSangkar bujur2=new BujurSangkar();// Membuat objek dengan nama "bujur2"
        
        Scanner tombol = new Scanner(System.in);//Membentuk Scanner dengan nama "tombol"
        System.out.print("Masukkan sisi bujur sangkar I :");//Menampilkan tulisan "Masukkan sisi bujur sangkar I :"
        bujur1.sisi = tombol.nextInt();//menginput objek bujur1 yang berisi variabel sisi dengan tipe integer 
        
        System.out.print("Masukkan sisi bujur sangkar II :");//Menampilkan tulisan "Masukkan sisi bujur sangkar II :"
        bujur2.sisi = tombol.nextInt();//menginput objek bujur2 yang berisi variabel sisi dengan tipe integer
        
System.out.println("Luas Bujur Sangkar dengan sisi = "+bujur1.sisi+" adalah "+bujur1.luas());
//mencetak tulisan "Luas bujur sangkar dengan sisi" ditambah dengan isi variable bujur1.sisi di tambah kata "adalah" ditambah isi variable bujur1.luas  
        
System.out.println("Luas Bujur Sangkar dengan sisi ="+bujur2.sisi+" adalah "+bujur2.luas());
//mencetak tulisan "Luas bujur sangkar dengan sisi" ditambah dengan isi variable bujur2.sisi di tambah kata "adalah" ditambah isi variable bujur2.luas  

    }
    
}


