/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_5;

import java.util.Scanner;
public class KelolaBuku {
    //Metode main
    public static void main(String[] args) {
        
        //Deklarasi variabel
        int counter = 0;
        int tahun;
        int lama;
        int baru;
        int indeksLama = 0;
        int indeksBaru = 0;
        
        //Membuat objek Scanner dengan nama input
        Scanner input = new Scanner(System.in);
        
        //Cetak kalimat
        System.out.print("Masukan jumlah buku baru yang akan disimpan: ");
        /*Membuat objek array of Buku dengan nama buku yang jumlah indeks 
        diketik user*/
        Buku[] buku = new Buku[input.nextInt()];
        //Deklarasi array of Pengarang dengan nama pengarang
        Pengarang[] pengarang;
        //Cetak baris kosong
        System.out.println("");
        
        //Mengisi data buku dan pengarang
        //Looping
        for (int i = 0; i < buku.length; i++) {
            //Membuat objek Buku di indeks ke i
            buku[i] = new Buku();
            //Cetak kalimat
            System.out.println("Buku ke-" + (i+1));
            System.out.print("Masukan kode buku         : ");
            //Panggil setter setKode di buku indeks i, parameter diketik user
            buku[i].setKode(ketik());
            //Cetak kalimat
            System.out.print("Masukan judul buku        : ");
            //Panggil setter setJudul di buku indeks i, parameter diketik user
            buku[i].setJudul(ketik());
            //Cetak kalimat
            System.out.print("Masukan tahun terbit      : ");
            //Panggil setter setTahun di buku indeks i, parameter diketik user
            buku[i].setTahun(input.nextInt());
            //Cetak kalimat
            System.out.print("Masukan jumlah pengarang  : ");
            /*Membuat array of Pengarang dengan nama pengarang yang jumlah 
            indeks diketik user*/
            pengarang = new Pengarang[input.nextInt()];
            //Looping
            for (int j = 0; j < pengarang.length; j++) {
                //Membuat objek pengarang di indeks ke j
                pengarang[j] = new Pengarang();
                //Cetak kalimat
                System.out.println("Pengarang ke-" + (j+1));
                System.out.print("Masukan nama pengarang    : ");
                //Panggil setter setNama, parameter diketik user
                pengarang[j].setNama(ketik());
                //Cetak kalimat
                System.out.print("Masukan NIK pengarang     : ");
                //Panggil setter setNik, parameter diketik user
                pengarang[j].setNik(ketik());
                //Cetak kalimat
                System.out.print("Masukan alamat pengarang  : ");
                //Panggil setter setAlamat, parameter diketik user
                pengarang[j].setAlamat(ketik());
            }
            //Panggil setter setPengarang, parameter pengarang
            buku[i].setPengarang(pengarang);
            //Cetak baris kosong
            System.out.println("");
            
        }
        
        //Menampilkan data buku
        //Cetak kalimat
        System.out.println("Menampilkan data buku");
        //Looping
        for (int i = 0; i < buku.length; i++) {
            //Cetak kalimat
            System.out.println("Buku "+(i+1));
            //Cetak kalimat dan panggil getter getKode di buku indeks i
            System.out.println("Kode buku   : "+buku[i].getKode());
            //Cetak kalimat dan panggil getter getJudul di buku indeks i
            System.out.println("Judul buku  : "+buku[i].getJudul());
            //Cetak kalimat dan panggil getter getTahun di buku indeks i
            System.out.println("Tahun terbit: "+buku[i].getTahun());
            //Looping
            for (int j = 0; j < buku[i].getPengarang().length; j++) {
                //Cetak kalimat
                System.out.println("Pengarang "+(j+1));
                System.out.println("Nama    : "
                        //Panggil getter getNama
                        +buku[i].getPengarang()[j].getNama());
                System.out.println("NIK     : "
                        //Panggil getter getNik
                        +buku[i].getPengarang()[j].getNik());
                System.out.println("Alamat  : "
                        //Panggil getter getAlamat
                        +buku[i].getPengarang()[j].getAlamat());
            }
            //Cetak baris kosong
            System.out.println("");
        }
        
        /*Menampilkan jumlah buku yang diterbitkan pada tahun tertentu
        Menampilkan juga buku terlama dan terbaru*/
        //Cetak kalimat
        System.out.println("Menampilkan jumlah buku yang diterbitkan"
                + " pada tahun tertentu");
        System.out.print("Masukan tahun terbit: ");
        //Ketikan user dan simpan ke variabel tahun
        tahun = input.nextInt();
        //Panggil getter getTahun di objek buku indeks 0 simpan ke variabel lama
        lama = buku[0].getTahun();
        //Panggil getter getTahun di objek buku indeks 0 simpan ke variabel baru
        baru = buku[0].getTahun();
        //Looping
        for (int i = 0; i < buku.length; i++) {
            //Jika nilai balikan getTahun sama dengan variabel tahun
            if (buku[i].getTahun() == tahun) {
                //Variabel counter + 1
                counter++;
            }
            //Jika variabel lama lebih besar dari nilai balikan getTahun
            if (lama > buku[i].getTahun()) {
                //Variabel indeksLama = i
                indeksLama = i;
            }
            //Jika variabel baru lebih kecil dari nilai balikan getTahun
            else if (baru < buku[i].getTahun()) {
                //Variabel indeksBaru = i
                indeksBaru = i;
            }
        }
        //Cetak kalimat, tampilkan counter
        System.out.println("Jumlah buku: "+counter);
        //Cetak baris kosong
        System.out.println("");
        //Cetak kalimat
        System.out.println("Buku terbitan terlama");
        //cetak kalimat, tampilkan getKode
        System.out.println("Kode buku   : "+buku[indeksLama].getKode());
        //cetak kalimat, tampilkan getJudul
        System.out.println("Judul buku  : "+buku[indeksLama].getJudul());
        //cetak kalimat, tampilkan getTahun
        System.out.println("Tahun terbit: "+buku[indeksLama].getTahun());
        //Cetak kalimat
        System.out.println("Buku terbitan terbaru");
        //cetak kalimat, tampilkan getKode
        System.out.println("Kode buku   : "+buku[indeksBaru].getKode());
        //cetak kalimat, tampilkan getJudul
        System.out.println("Judul buku  : "+buku[indeksBaru].getJudul());
        //cetak kalimat, tampilkan getTahun
        System.out.println("Tahun terbit: "+buku[indeksBaru].getTahun());
        
    }
    //Method ketik
    public static String ketik(){
        //Membuat objek Scanner dengan nama input
        Scanner input = new Scanner(System.in);
        //Nilai balikan ketikan user
        return input.nextLine();
    }
    
}


