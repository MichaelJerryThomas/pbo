package Modul_4;
import javax.swing.*;
import java.util.Scanner;
public class KelolaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Membuat objek Scanner
        //Meminta masukan pengguna untuk jumlah buku yang ingin dimasukkan
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Banyak Buku : "));
        Buku [] buku;// Deklarasi array buku
        buku = new Buku[n];// Membuat array buku dengan panjang n
            // Menerima informasi tentang masing-masing buku dari pengguna
            for (int i = 0; i < buku.length; i++) {

                String kode = JOptionPane.showInputDialog(null, "Masukan Kode Buku : ");
                String judul = JOptionPane.showInputDialog(null, "Masukan judul Buku : ");
                int tahun = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Tahun Terbit Buku : "));
                String pengarang = JOptionPane.showInputDialog(null, "Masukan pengarang Buku : ");

                buku[i] = new Buku(judul, pengarang);// Membuat objek Buku
                buku[i].setKodeBuku(kode);//Mengatur kode buku
                buku[i].setTahun(tahun);//Mengatur tahun terbit
            }
        
        
        Buku Buku1 = buku[0];// Membuat objek Buku1 dengan mengambil buku pertama dari array
        System.out.println("No\t" + " Kode Buku\t" +" Judul\t\t" + "Tahun Terbit\t\t" + "Pengarang");
            // Mencetak informasi tentang masing-masing buku dalam bentuk tabel
            for (int i = 0; i < buku.length; i++) {
                
                    System.out.println((i+1) +"\t "+ buku[i].getKodeBuku() +"\t\t "+ buku[i].getJudul() +"  \t\t " + buku[i].getTahun() +"\t\t\t "+ buku[i].getNamaPengarang());
                    Buku1 = buku[i];                   
            }
        
        System.out.print("Masukan Tahun : ");
        int n1 = input.nextInt();
       
        System.out.print("jumlah buku pada "+n1 +" ada : "+Buku1.tahunSearching(n1, buku));
        
        
        System.out.print("\nMasukan Judul : ");
        String Judul = input.next();       
        Buku1.dataBuku(Judul);
        
    }
}